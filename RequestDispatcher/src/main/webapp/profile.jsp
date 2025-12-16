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
	String myName = (String) request.getAttribute("key");
	%>
	<h1>Welcome <%=myName %></h1>
</body>
</html>