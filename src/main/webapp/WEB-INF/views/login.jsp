<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login - Group 51</title>
</head>

<body>
    <div align="center" >
        <div id = "main"  style=" margin-top: 150px; background: rgb(175, 165, 165); width: 550px; height: 250px; padding: 20px; border-radius: 25px; ">
    <h2>Welcome to CZ3002 - Assignment 2 Login!</h2>
    <h4>Please enter your credentials below:</h4>
    <s:form action="login">
        <s:textfield name="Username" key="Username"/>
        <s:password name="Password" key="Password" />
        <s:submit/>
        </div>
    </div>
    </s:form>
</body>
</html>
