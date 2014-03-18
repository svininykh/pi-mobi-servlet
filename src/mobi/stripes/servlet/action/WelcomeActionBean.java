/**
 * Copyright (c) 2014 Nord Trading Ltd.
 */
package mobi.stripes.servlet.action;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 * @author Andrey Svininykh <svininykh@gmail.com>
 */
public class WelcomeActionBean extends BaseActionBean {

    private static final String WELCOME = "/WEB-INF/jsp/welcome_guest.jsp";

    private String guestName;

    public Resolution welcome() {
        return new ForwardResolution(WELCOME);
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}
