/**
 * Copyright (c) 2014 Nord Trading Ltd.
 */
package mobi.stripes.servlet.action;

import javax.servlet.ServletContext;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * <img src="../../../../images/BaseActionBean.png"/>
 *
 * @author Andrey Svininykh <svininykh@gmail.com>
 *
 * @startuml
 *
 * abstract class BaseActionBean {
 *     - actionBeanContext : ActionBeanContext
 *     + getContext() : ActionBeanContext
 *     + setContext(actionBeanContext : ActionBeanContext) : void
 *     + getServletContext() : ServletContext
 * }
 *
 * HomeActionBean --|> BaseActionBean
 * WelcomeActionBean --|> BaseActionBean
 * 
 * class HomeActionBean {
 *     - HOME : String
 *     - INFO : String
 *     + home() : Resolution
 *     + info() : Resolution
 *     + getCountry() : String
 *     + getLanguage() : String
 *     + getServerInfo() : String
 *     + getJavaVersion() : String
 *     + getOperationSystem() : String
 * }
 *
 * class WelcomeActionBean {
 *     - WELCOME : String
 *     - guestName : String
 *     + welcome() : Resolution
 *     + getGuestName() : String
 *     + setGuestName(guestName : String ) : void
 * }
 * @enduml
 */
public abstract class BaseActionBean implements ActionBean {

    private ActionBeanContext actionBeanContext;

    @Override
    public ActionBeanContext getContext() {
        return actionBeanContext;
    }

    @Override
    public void setContext(ActionBeanContext actionBeanContext) {
        this.actionBeanContext = actionBeanContext;
    }

    public ServletContext getServletContext() {
        return getContext().getServletContext();
    }
}
