<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<form id="userUpdate" action="update" method="post">
    <table>
        <tr><td colspan="2"><input type="hidden" id="id" name="id" value="${user.id}"></td></tr>
        <tr>
            <td>用户名：</td>
            <td><input id="username" name="username" value="${user.username}" type="text"/></td>
        </tr>
        <tr>
            <td>昵&nbsp;&nbsp;&nbsp;&nbsp;称：</td>
            <td><input id="nikename" name="nikename" value="${user.nikename} "type="text"/></td>
        </tr>
        <tr>
            <td>邮&nbsp;&nbsp;&nbsp;&nbsp;箱：</td>
            <td><input id="email" name="email"  value="${user.email}" type="text"/></td>
        </tr>
        <tr>
            <td>性&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
            <td>
                <input type="radio" name="sex" value="male" <c:if test="${user.sex eq 'male'}">checked="checked"</c:if>/>male
                <input type="radio" name="sex" value="female" <c:if test="${user.sex eq 'female'}">checked="checked"</c:if>/>female
            </td>
        </tr>
        <tr>
            <td>城&nbsp;&nbsp;&nbsp;&nbsp;市：</td>
            <td>
                <select id="city" name="city" style="height: 30px;">
                    <c:forEach var="city" items="${citys}">
                        <option value="${city}" <c:if test="${user.city eq city}">selected="selected"</c:if> >${city}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
           <td colspan="2"><input type="submit" value="更新"/></td>
        </tr>
    </table>
</form>
</body>
</html>
