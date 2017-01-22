<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>

<html>
<head>
    <title>Shiro综合案例</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery.layout.js"></script>
    <script>
        $(document).ready(function () {
            $('body').layout(
                {
                    applyDefaultStyles: true
                });
        });
    </script>
</head>
<body>

<iframe name="content" class="ui-layout-center" src="${ctx}/welcome" frameborder="0" scrolling="auto">
</iframe>
<div class="ui-layout-north">欢迎[<shiro:principal/>]学习Shiro综合案例，<a href="${ctx}/logout">退出</a></div>
<div class="ui-layout-south">
    获取源码：<a href="https://github.com/zhangkaitao/shiro-example" target="_blank">https://github.com/zhangkaitao/shiro-example</a>
</div>
<div class="ui-layout-west">
    功能菜单<br/>
    <c:forEach items="${menus}" var="m">
        <a href="${ctx}${m.url}" target="content">${m.name}</a><br/>
    </c:forEach>
</div>
</body>
</html>