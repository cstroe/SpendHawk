[#ftl]
[#assign s=JspTaglibs["http://stripes.sourceforge.net/stripes.tld"]]
<!DOCTYPE html>
<html>
<head>
    <title>Login :: SpendHawk</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" type="text/css" href="/webjars/Semantic-UI/${actionBean.getResource("semanticui_version")}/semantic.min.css"/>
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
<script src="/webjars/jquery/${actionBean.getResource("jquery_version")}/jquery.js"></script>
<script src="/webjars/Semantic-UI/${actionBean.getResource("semanticui_version")}/semantic.js"></script>

<div class="ui middle aligned center aligned grid">
    <div class="ui four wide column">
        <div class="ui attached message">
            <div class="header">
                SpendHawk
            </div>
        </div>
        <div class="ui form attached fluid segment">
            [@s.form beanclass="com.github.cstroe.sqs.www.LoginBean" id="loginForm"]
                [@s.errors/]
                <div class="inline field">
                    <div class="field">
                        <input placeholder="Enter username" type="text" name="username" id="username_button"/>
                    </div>
                </div>
                <div class="inline field">
                    <div class="field">
                        <input placeholder="Enter password" type="password" name="password"/>
                    </div>
                </div>
                <div class="inline field">
                    <div class="ui checkbox">
                        <input type="checkbox" name="rememberMe"/>
                        <label>Remember me</label>
                    </div>
                </div>
                <button class="ui fluid large primary button" type="submit">Login</button>
            [/@]
            <script>
                $(function() {
                    $('#username_button').focus();
                });
            </script>
        </div>
    </div>
</div>
</body>
</html>