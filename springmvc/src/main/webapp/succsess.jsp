<%@page import="com.te.controller.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Register ref = (Register) request.getAttribute("register");
	%>
	<h1 style="color: red;"><%=ref.getName()%>
		Register Succsessfull!!!</h1>
		
		<h1><%= ref.getName()+"\n"+ref.getAddress()+"\n"+ref.getEmail()+"\n"+ref.getContactNumber()%></h1>

		<h1>succsesfully log in ...</h1>
		
		
		
		
</body>
</html>