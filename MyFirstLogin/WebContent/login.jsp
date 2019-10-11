<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<table
			style="background-color: skyblue; margin-left: 20px; margin-top: 20px;">
			<!--  
			<tr>
				<td><h3 style="color: red;">${message}</h3>
				<td><h3 style="color: green;">${successMessage}</h3></td>
			</tr>-->
			<tr>
				<td><h3 style="color: red">Login Page !!!</h3>
			</tr>

			<tr>
				<td>Username :</td>
				<td><input type="text" name="username" required="required"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password" required="required"></td>
			</tr>
			<tr>
				<td><input type="submit" name="login" value="login"></td>
				<td><a href="register.jsp">Registration</a></td>
			</tr>
		</table>

	</form>
</body>
</html>