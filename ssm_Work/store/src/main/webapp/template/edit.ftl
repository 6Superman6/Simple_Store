<!DOCTYPE html>
<html>
<#include "/include/head.ftl">
<body>
<#include "/include/support.ftl">
<#include "/include/header.ftl"><div class="g-doc">
    <div class="m-tab m-tab-fw m-tab-simple f-cb">
        <h2>内容编辑</h2>
    </div>
    <#if !product>
    <div class="n-result">
        <h3>内容不存在！</h3>
    </div>
    <#else>
    <div class="n-public">
        <form class="m-form m-form-ht" id="form" method="post" action="${pageContext.request.contextPage}/content/editSubmit?id=${product.id}">
            <div class="fmitem">
                <label class="fmlab">标题：</label>
                <div class="fmipt">
                    <input type="hidden" name="id" value="${product.id}"/>
                    <input class="u-ipt ipt" name="title" value="${product.title}" placeholder="2-80字符"/>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">摘要：</label>
                <div class="fmipt">
                    <input class="u-ipt ipt" name="remark" value="${product.remark}" placeholder="2-140字符"／>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">图片：</label>
                <div class="fmipt">
                    <input class="u-ipt ipt" name="icon" value="${product.icon}" placeholder="图片地址"/>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">正文：</label>
                <div class="fmipt">
                    <textarea class="u-ipt" name="text" rows="10" placeholder="2-1000个字符">${product.text}</textarea>
                </div>
            </div>
            <div class="fmitem">
                <label class="fmlab">价格：</label>
                <div class="fmipt">
                    <input class="u-ipt price" name="price" value="${product.price}"/>元
                </div>
            </div>
            <div class="fmitem fmitem-nolab fmitem-btn">
                <div class="fmipt">
                    <button type="submit" class="u-btn u-btn-primary u-btn-lg">保 存</button>
                </div>
            </div>
        </form>
        <span class="imgpre"><img src="${product.icon}" alt="" id="imgpre"></span>
    </div>
    </#if>
</div>
<#include "/include/footer.ftl">
<script type="text/javascript" src="/js/global.js"></script>
<script type="text/javascript" src="/js/public.js"></script>
</body>
</html>