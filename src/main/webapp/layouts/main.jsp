<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://stripes.sourceforge.net/stripes.tld" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="define_javascript_library_versions.jsp"/>

<s:layout-definition>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="utf-8">
        <title>${title}</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="/webjars/Semantic-UI/${semanticui_version}/semantic.min.css">
    </head>

    <body>
      <jsp:include page="scripts.jsp"/>
      <s:layout-component name="pageBody"/>
    </body>
    </html>
</s:layout-definition>