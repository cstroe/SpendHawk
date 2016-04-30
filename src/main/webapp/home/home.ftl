[#ftl]
[#assign s=JspTaglibs["http://stripes.sourceforge.net/stripes.tld"]]
[@s["layout-render"] name="/layouts/main.ftl" title="Home :: SpendHawk"]
[@s["layout-component"] name="pageBody"]
    <div class="ui container">
        <div class="ui secondary pointing menu">
            <a class="active item">
                Accounts
            </a>
            <div class="right menu">
                <a href="/app/logout" class="ui item">
                    Logout
                </a>
            </div>
        </div>
        <div class="ui clearing segment">
            <h3 class="ui right floated header">
                + Add Account
            </h3>
        </div>

        <div class="ui middle aligned list">
            [#list actionBean.accounts as account]
                <div class="item">
                    <div class="content">
                        Account ${account.id}
                    </div>
                </div>
            [/#list]
        </div>
    </div>
[/@]
[/@]