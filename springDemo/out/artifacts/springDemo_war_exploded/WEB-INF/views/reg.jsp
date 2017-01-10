<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>reg</title>
</head>
<body>
<form id="userReg" action="reg" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input id="username" name="username" type="text"/></td>
        </tr>
        <tr>
            <td>昵&nbsp;&nbsp;&nbsp;&nbsp;称：</td>
            <td><input id="nikename" name="nikename" type="text"/></td>
        </tr>
        <tr>
            <td>邮&nbsp;&nbsp;&nbsp;&nbsp;箱：</td>
            <td><input id="email" name="email" type="text"/></td>
        </tr>
        <tr>
            <td>性&nbsp;&nbsp;&nbsp;&nbsp;别：</td>
            <td>
                <input type="radio" name="sex" value="male" checked="checked"/>male
                <input type="radio" name="sex" value="female"/>female
            </td>
        </tr>
        <tr>
            <td>城&nbsp;&nbsp;&nbsp;&nbsp;市：</td>
            <td>
                <select id="city" name="city" style="height: 30px;">
                    <c:forEach var="city" items="${citys}">
                        <option value="${city}">${city}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
           <td colspan="2"><input type="submit" value="注册"/></td>
        </tr>
    </table>
</form>
</body>
</html>
