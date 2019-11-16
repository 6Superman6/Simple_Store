<!DOCTYPE html>
<html>
<#include "/include/head.ftl">
<body>
<#include "/include/support.ftl">
<#include "/include/header.ftl">
<div class="g-doc">
    <#if !product>
    <div class="n-result">
        <h3>内容不存在！</h3>
    </div>
    <#else>
    <div class="n-show f-cb" id="showContent">
        <div class="img"><img src="${product.icon}" alt=""></div>
        <div class="cnt">
            <h2>${product.title}</h2>
            <p class="summary">${product.remark}</p>
            <div class="price">
                <span class="v-unit">¥</span><span class="v-value">${product.price}</span>
            </div>
            <div class="oprt f-cb">
                <#if user && user.usertype==0>
                    <#if product.isbuy>
                    <span class="u-btn u-btn-primary z-dis">已购买</span>
                    <span class="buyprice">当时购买价格：¥${product.price}</span>
                    <#else>
                    <button class="u-btn u-btn-primary" data-buy="${product.id}"><a href="${pageContext.request.contextPage}/content/buysure?id=${product.id}" >购 买</a></button>
                    </#if>
                    <p>
                        <#if msg>
                            <h2 style="color:red">&nbsp;&nbsp;&nbsp;&nbsp;${msg}</h2>
                        </#if>
                    </p>
                </#if>
                <#if user && user.usertype==1>
                <a href="${pageContext.request.contextPage}/content/edit?id=${product.id}" class="u-btn u-btn-primary">编 辑</a>
                </#if>
            </div>
        </div>
    </div>
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <h2>详细信息</h2>
    </div>
    <div class="n-detail">
        ${product.text}
    </div>
    </#if>
</div>
<#include "/include/footer.ftl">
<#--<script type="text/javascript" src="/js/global.js"></script>-->
<#--<script type="text/javascript" src="/js/pageShow.js"></script>-->
</body>
</html>