<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/25/2019
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Loginpage</title>
</head>
<body>
    <form:form method="post" modelAttribute="loginForm" action="/login">
        <form:label path="username">Username : </form:label>
        <form:input path="username"></form:input>
        <form:label path="password">Password : </form:label>
        <form:input path="password"></form:input>
        <input type="submit" value="Login">
        <div style="color: red">${errorMessage}</div>
    </form:form>
</body>
</html>
