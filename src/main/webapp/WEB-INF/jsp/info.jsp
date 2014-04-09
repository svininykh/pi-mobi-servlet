<%--
    Document   : service_info
    Created on : 21.11.2013, 17:26:30
    Author     : Andrey Svininykh (svininykh@gmail.com)
    Copyright  : Nord Trading Ltd.
--%>

<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<stripes:layout-render name="/WEB-INF/jsp/common/layout_main.jsp"
                       title="Information"
                       pageid="information">

    <stripes:layout-component name="header">
        <sdynattr:link href="/Home.action"
                       class="ui-btn-left ui-btn ui-icon-home ui-btn-icon-left ui-shadow ui-corner-all"
                       role="button">
            <stripes:label name="label.home" />
        </sdynattr:link>
        <h1 role="heading" aria-level="1">
            <stripes:label name="label.information" />
        </h1>
    </stripes:layout-component>

    <stripes:layout-component name="content">
        <div class="ui-grid-a ui-responsive">
            <div class="ui-block-a">
                <div class="ui-body ui-body-c">
                    <stripes:label name="label.info.java.version" />
                </div>
            </div>
            <div class="ui-block-b">
                <div class="ui-body ui-body-c">
                    <c:out value="${actionBean.javaVersion}" />
                </div>
            </div>
            <div class="ui-block-a">
                <div class="ui-body ui-body-c">
                    <stripes:label name="label.info.os" />
                </div>
            </div>
            <div class="ui-block-b">
                <div class="ui-body ui-body-c">
                    <c:out value="${actionBean.operationSystem}" />
                </div>
            </div>
            <div class="ui-block-a">
                <div class="ui-body ui-body-c">
                    <stripes:label name="label.info.server" />
                </div>
            </div>
            <div class="ui-block-b">
                <div class="ui-body ui-body-c">
                    <c:out value="${actionBean.serverInfo}" />
                </div>
            </div>
            <div class="ui-block-a">
                <div class="ui-body ui-body-c">
                    <stripes:label name="label.info.language" />
                </div>
            </div>
            <div class="ui-block-b">
                <div class="ui-body ui-body-c">
                    <c:out value="${actionBean.language}" />
                </div>
            </div>
            <div class="ui-block-a">
                <div class="ui-body ui-body-c">
                    <stripes:label name="label.info.country" />
                </div>
            </div>
            <div class="ui-block-b">
                <div class="ui-body ui-body-d">
                    <c:out value="${actionBean.country}" />
                </div>
            </div>
        </div>
    </stripes:layout-component>

    <stripes:layout-component name="footer">

    </stripes:layout-component>
</stripes:layout-render>
