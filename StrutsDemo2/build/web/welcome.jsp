
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <bean:write name="User" property="username"/></h1>
    </body>
</html>
