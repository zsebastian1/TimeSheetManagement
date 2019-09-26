<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>You should log in</h2>
<div>
	<form action="/login" method="post">
	<table>
		<tr>
			<td><p>Email Address</p></td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td><p>Password</p></td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit"></td>
		</tr>
	</table>
	</form>

	<p>Don't have an account yet?  Make one <a href="registration.jsp">here</a></p>
</div>
</body>
</html>