<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>
	<%
	String myName = (String) session.getAttribute("key");
	%>
	<h1>Welcome <%=myName %></h1>
	
	<a href="home.jsp">Home</a> &nbsp;&nbsp;
	<a href="about-us.jsp" >About Us</a> &nbsp;&nbsp;
	<a href="logout">Log out</a>
</body>
</html>