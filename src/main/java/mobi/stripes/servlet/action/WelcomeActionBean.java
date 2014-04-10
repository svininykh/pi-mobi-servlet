/**
 * Copyright (c) 2014 Nord Trading Ltd.
 */
package mobi.stripes.servlet.action;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import mobi.stripes.servlet.dao.BaseDAO;
import mobi.stripes.servlet.dao.GuestDAO;
import mobi.stripes.servlet.dao.LogDAO;
import mobi.stripes.servlet.model.Guest;
import mobi.stripes.servlet.model.Log;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;
import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;
import com.google.code.morphia.query.QueryResults;

/**
 * @author Andrey Svininykh <svininykh@gmail.com>
 */
public class WelcomeActionBean extends BaseActionBean {

    private static final String WELCOME = "/WEB-INF/jsp/welcome_guest.jsp";

    @Validate(required = true)
    private String guestName;

    public Resolution welcome() {
        try {
            BaseDAO base = new BaseDAO();
            base.setUp();
            GuestDAO guestDAO = new GuestDAO(base.getMorphia(), base.getMongo(), base.getDbName());
            Datastore datastore = base.getMorphia().createDatastore(base.getMongo(), base.getDbName());
            Query<Guest> query = datastore.createQuery(Guest.class);
            query.filter("name", guestName);
//            QueryResults<Guest> retrievedGuest = guestDAO.find(query);
            Guest guest;

//            if (retrievedGuest.countAll() == 0) {
            if(guestDAO.exists("name", guestName)) {
                guest = guestDAO.findOne(query);
            } else {
                guest = new Guest();
                guest.setName(guestName);
                guestDAO.save(guest);
            }

            LogDAO logDAO = new LogDAO(base.getMorphia(), base.getMongo(), base.getDbName());
            Log log = new Log();
            log.setDate(new Date());
            log.setGuest(guest);
            logDAO.save(log);
        } catch (UnknownHostException ex) {
            Logger.getLogger(WelcomeActionBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new ForwardResolution(WELCOME);
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}
