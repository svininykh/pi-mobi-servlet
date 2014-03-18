/**
 * Copyright (c) 2014 Nord Trading Ltd.
 */
package mobi.stripes.servlet.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 * @author Andrey Svininykh <svininykh@gmail.com>
 */
public class HomeActionBean extends BaseActionBean {

    private static final String HOME = "/WEB-INF/jsp/home.jsp";

    @DefaultHandler
    public Resolution home() {
        return new ForwardResolution(HOME);
    }

    private static final String INFO = "/WEB-INF/jsp/info.jsp";

    public Resolution info() {
        return new ForwardResolution(INFO);
    }

    public String getCountry() {
        return getContext().getLocale().getDisplayCountry();
    }

    public String getLanguage() {
        return getContext().getLocale().getDisplayLanguage();
    }

    public String getServerInfo() {
        return getServletContext().getServerInfo();
    }

    public String getJavaVersion() {
        return System.getProperty("java.vendor") + " " + System.getProperty("java.version");
    }

    public String getOperationSystem() {
        return System.getProperty("os.name") + " " + System.getProperty("os.version") + " " + System.getProperty("os.arch");
    }
}
