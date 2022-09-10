

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib  prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html:form action="/login">
        <table>
            <tr>
                <td colspan="2" style="color:red"><bean:write name="User" property="errmsg"/></td>
            </tr> 
            <Tr>
                <td>Username</td>
                <td><html:text property="username"/></td>
            </Tr>
            <Tr>
                <td>Password</td>
                <td><html:password property="password"/></td>
            </Tr>
            <Tr>
                <td><html:submit value="Login"/></td>
                <td><html:reset value="Reset"/></td>
            </Tr>
        </table>
        </html:form>
    </body>
</html>
