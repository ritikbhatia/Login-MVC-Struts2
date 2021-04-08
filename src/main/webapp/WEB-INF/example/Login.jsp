<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Sign On</title>
</head>

<body>
<s:form action="LoginProcess">
    <s:textfield name="username" key="username"/>
    <s:password name="password" key="password" />
    <s:submit value="Login"/>
</s:form>
</body>
</html>
