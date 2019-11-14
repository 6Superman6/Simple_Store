<!DOCTYPE html>
<html>
<#include "/include/head.ftl">
<body>
<#include "/include/support.ftl">
<#include "/include/header.ftl">
<form class="m-form m-form-ht n-login" id="loginForm" action="../person/login" method="post">
    <#--提示信息-->
    <#if msg>
        <h3 align="right" style="color:red">${msg}</h3>
    </#if>
    <#--提示信息-->
    <div class="fmitem">
        <label class="fmlab">用户名：</label>
        <div class="fmipt">
            <input class="u-ipt" name="username" autofocus/>
        </div>
    </div>
    <div class="fmitem">
        <label class="fmlab">密码：</label>
        <div class="fmipt">
            <input class="u-ipt" type="password" name="password"/>
        </div>
    </div>
    <div class="fmitem fmitem-nolab fmitem-btn">
        <div class="fmipt">
            <button type="submit" class="u-btn u-btn-primary u-btn-lg u-btn-block">登 录</button>
        </div>
    </div>
    <div class="fmitem fmitem-nolab fmitem-btn">
        <div class="fmipt">
            <a href="/person/in">注 册</a>
        </div>
    </div>
</form>
<#include "/include/footer.ftl">
<script type="text/javascript" src="/js/md5.js"></script>
<script type="text/javascript" src="/js/global.js"></script>
<script type="text/javascript" src="/js/pageLogin.js"></script>
</body>
</html>