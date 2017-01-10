<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rj
  Date: 16-11-27
  Time: 下午5:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
你好，${user.username}<br>
昵称，${user.nikename}<br>
性别，${user.sex}<br>
邮箱，${user.email}<br>
城市，${user.city}<br>
<table>
    <th>标题</th>
    <th>内容</th>
    <c:forEach items="${user.blogList}" var="blog">
        <tr>
            <td>${blog.blogTitle}</td>
            <td>${blog.blogContent}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
