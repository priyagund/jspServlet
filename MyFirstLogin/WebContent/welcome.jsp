<%@page import="com.bridgelabz.servlet.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<%

Student student=(Student)request.getAttribute("student");

out.println(student.getName());
out.println(student.getmailId());
out.println(student.getMobNumber());

	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");

	}
%>


<body style="background-color: lightpink">
	<form action="welcome">

		<h1>Hi We Welcome You !!!</h1>
		<input type="submit" value="log out">


	</form>
</body>

</html>