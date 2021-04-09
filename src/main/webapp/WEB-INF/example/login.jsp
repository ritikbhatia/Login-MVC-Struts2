<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login - Group 51</title>
</head>

<body>
    <div align="center" style="padding-top: 150px;">
        <div id = "main" align="center" style="background: rgb(175, 165, 165); width: 550px; height: 250px; padding: 20px; border-radius: 25px; ">
            <p style = "opacity: 1;">
    <h2>Welcome to CZ3002 - Assignment 2 Login!</h2>
    <h4>Please enter your credentials below:</h4>
    <s:form action="login">
        <s:textfield name="username" key="username"/>
        <s:password name="password" key="password" />
        <s:submit/>
            </p>
        </div>
    </div>
    </s:form>
</body>
</html>
