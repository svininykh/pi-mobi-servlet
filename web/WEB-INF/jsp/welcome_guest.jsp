<%--
    Document   : hello_guest
    Created on : Jan 10, 2014, 10:41:11 AM
    Author     : Andrey Svininykh (svininykh@gmail.com)
    Copyright  : Nord Trading Ltd.
    License    : Apache License, Version 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
--%>

<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<stripes:layout-render name="/WEB-INF/jsp/common/layout_main.jsp"
                       title="Welcome User"
                       pageid="WelcomeUser">

    <stripes:layout-component name="header">
        <sdynattr:link href="/Home.action"
                       class="ui-btn-left ui-btn ui-icon-home ui-btn-icon-left ui-shadow ui-corner-all"
                       role="button">
            <stripes:label name="label.home" />
        </sdynattr:link>
        <h2>
            <stripes:label name="label.WelcomeUser" />
        </h2>
    </stripes:layout-component>

    <stripes:layout-component name="content">
        <div class="ui-body ui-body-b ui-corner-all">
                    <stripes:label name="label.Welcome" />
                    <strong><c:out value="${actionBean.guestName}" /></strong>
                    <stripes:label name="label.toStripes" />                
        </div>
    </stripes:layout-component>

    <stripes:layout-component name="footer">

    </stripes:layout-component>
</stripes:layout-render>
