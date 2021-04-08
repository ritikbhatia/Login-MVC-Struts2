<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
</head>

<body>
<s:form action="login">
    <s:textfield name="username" key="username"/>
    <s:password name="password" key="password" />
    <s:submit/>
</s:form>
</body>
</html>
