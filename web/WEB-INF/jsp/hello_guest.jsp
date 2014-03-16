<%--
    Document   : hello_guest
    Created on : Jan 10, 2014, 10:41:11 AM
    Author     : Andrey Svininykh (svininykh@gmail.com)
    Copyright  : Nord Trading Ltd.
    License    : Apache License, Version 2.0 (http://www.apache.org/licenses/LICENSE-2.0.html)
--%>

<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<stripes:layout-render name="/WEB-INF/jsp/common/layout_main.jsp"
                       title="Hello Guest"
                       pageid="HelloGuest">

    <stripes:layout-component name="header">
        <sdynattr:link href="/Home.action"
                       class="ui-btn-left"
                       data-icon="bars">
            <stripes:label name="label.home" />
        </sdynattr:link>
        <h2>
            <stripes:label name="label.HelloGuest" />
        </h2>
    </stripes:layout-component>

    <stripes:layout-component name="content">
        <div class="ui-grid-solo">
            <div class="ui-block-a">
                <div class="ui-bar ui-bar-b">
                    <c:out value="${actionBean.guestName}" />
                </div>
            </div>
        </div>
    </stripes:layout-component>

    <stripes:layout-component name="footer">

    </stripes:layout-component>
</stripes:layout-render>
