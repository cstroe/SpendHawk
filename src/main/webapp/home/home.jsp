<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://stripes.sourceforge.net/stripes.tld" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<s:layout-render
    name="/layouts/main.jsp"
    title="Home :: SpendHawk">
  <s:layout-component name="pageBody">
    <div class="ui container">
       Hello!
    </div>
  </s:layout-component>
</s:layout-render>