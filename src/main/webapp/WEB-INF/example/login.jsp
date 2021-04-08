<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login - Group 51</title>
</head>

<body>
    <h2>Welcome to CZ3002 - Assignment 2 Login!</h2>
    <h4>Please enter your credentials below:</h4>
    <s:form action="login">
        <s:textfield name="username" key="username"/>
        <s:password name="password" key="password" />
        <s:submit/>
    </s:form>
</body>
</html>
