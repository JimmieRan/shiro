<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: rj
  Date: 16-11-27
  Time: 下午5:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
   <form id="sysLogin" action="${ctx}/login" method="post">
       <table>
           <tr>
               <td>用户名：</td>
               <td><input id="username" name="username" type="text" value="<shiro:principal/>" placeholder="请填写登录账号" /></td>
           </tr>
           <tr>
               <td>密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
               <td><input id="password" name="password" type="password" placeholder="请填写登录账号" /></td>
           </tr>
           <tr><td colspan="2">记住我：<input type="checkbox" name="rememberMe" value="yes"/></tr>
           <tr>
               <td colspan="2"><input type="submit" value="登录"/></td>
           </tr>
       </table>
   </form>
    <label style="color: rebeccapurple;">${message}</label>
</body>
</html>