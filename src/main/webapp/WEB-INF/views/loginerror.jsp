<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<body>
        <!-- Display error message when login credential is invalid-->
        <div id = "main" align="center" style=" position: relative; top: 140px; color: red">
                Invalid username/password
</div>
<!--Include the login page content with error message displayed above-->
<jsp:include page="login.jsp"/>


</body>
</html>
