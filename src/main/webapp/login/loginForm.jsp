<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://stripes.sourceforge.net/stripes.tld" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<s:layout-render
    name="/layouts/main.jsp"
    title="Login :: SpendHawk">
  <s:layout-component name="pageBody">
    <div class="ui container">
      <s:form beanclass="com.github.cstroe.sqs.www.LoginBean"
              id="loginForm"
              class="ui form">
        <s:errors/>
        <input type="text" name="username"/>
        <input type="password" name="password"/>
        <input type="checkbox" name="rememberMe"/>
        <input type="submit" value="login"/>
      </s:form>
    </div>
  </s:layout-component>
</s:layout-render>