<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<jsp:include page="header.jsp"></jsp:include>
		<h3>This is login page</h3>
		
		<form>
			<table border='1'>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"/></td>
					<td><input type="reset" value="Reset"/></td>
				</tr>
			</table>
		</form>
		
		<jsp:include page="footer.jsp"></jsp:include>
	</center>
</body>
</html>