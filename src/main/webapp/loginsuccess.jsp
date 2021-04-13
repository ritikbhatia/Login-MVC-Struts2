<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head><title><s:text name="LoginSuccess.message"/></title></head>

<body>
    <!-- Display login success message when login credential is invalid-->
    <div align="center" >
        <div id = "main"  style=" margin-top: 150px; background: rgb(175, 165, 165); width: 550px; height: 250px; padding: 20px; border-radius: 25px; ">
    <p style="padding-top: 100px;">Successful login</p>
    <!--Redirect back to login page upon logout-->
    <button type="button"><a href="http://localhost:8080/login">Logout</a></button> 
    </div>
    </div>
</body>
</html>