<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://stripes.sourceforge.net/stripes.tld" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<jsp:include page="/layouts/define_javascript_library_versions.jsp"/>

<!DOCTYPE html>
<html>
  <head>
    <title>Login :: SpendHawk</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" type="text/css" href="/webjars/Semantic-UI/${semanticui_version}/semantic.min.css"/>
    <style type="text/css">
      body {
        background-color: #FFFFFF;
      }
      body > .grid {
        height: 100%;
      }
      .image {
        margin-top: -100px;
      }
      .column {
        max-width: 450px;
      }
    </style>
  </head>

  <body>
    <jsp:include page="/layouts/scripts.jsp"/>
    <div class="ui middle aligned center aligned grid">
      <div class="ui four wide column">
        <div class="ui attached message">
          <div class="header">
            SpendHawk
          </div>
        </div>
        <div class="ui form attached fluid segment">
          <s:form beanclass="com.github.cstroe.sqs.www.LoginBean" id="loginForm">
            <s:errors/>
            <div class="inline field">
              <div class="field">
                <input placeholder="Enter username" type="text" name="username"/>
              </div>
            </div>
            <div class="inline field">
              <div class="field">
                <input placeholder="Enter password" type="text" name="password"/>
              </div>
            </div>
            <div class="inline field">
              <div class="ui checkbox">
                <input type="checkbox" name="rememberMe"/>
                <label>Remember me</label>
              </div>
            </div>
            <button class="ui button" type="submit">Login</button>
          </s:form>
        </div>
      </div>
    </div>
  </body>
</html>