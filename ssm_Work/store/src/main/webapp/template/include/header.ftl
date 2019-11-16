<div class="n-head">
    <div class="g-doc f-cb">
        <div class="user">
        <#if user>
            <#if autoin>
                <#if user.usertype==1>卖家<#else>买家</#if>你好，<span class="name">${user.username}</span>！<a href="${pageContext.request.contextPage}/user/out">[退出]</a>
            </#if>
        <#else>
            请<a href="${pageContext.request.contextPage}/user/login">[登录]</a>
        </#if>
        </div>
        <ul class="nav">
            <li><a href="/user/root">首页</a></li>
            <#if user && user.usertype==0>
            <li><a href="${pageContext.request.contextPage}/content/account">账务</a></li>
            </#if>
            <#if user && user.usertype==1>
            <li><a href="${pageContext.request.contextPage}/content/pub">发布</a></li>
            </#if>
        </ul>
    </div>
</div>