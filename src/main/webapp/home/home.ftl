[#ftl]
[#-- @ftlvariable name="actionBean" type="com.github.cstroe.sqs.www.HomeBean" --]
[#assign pageTitle="Accounts :: Spendhawk"]
[#include "/layouts/main_header.ftl"]
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

    <table class="ui celled striped compact table">
        <thead>
            <tr>
                <th>Account</th>
                <th>Balance</th>
            </tr>
        </thead>
        <tbody>
            [#list actionBean.accounts as account]
            <tr>
                <td><i class="dollar icon"></i>${account.name}</td>
                <td>${account.balance}</td>
            </tr>
            [/#list]
        </tbody>
    </table>
</div>

[#include "/layouts/main_footer.ftl"]