<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart</title>
</head>
<body>

<%
	String[] selectedCars = (String[])session.getAttribute("selectedCars");
	String[] selectedBooks = (String[])session.getAttribute("selectedBooks");
	String[] selectedBikes = request.getParameterValues("bike");	
%>
<h4>Selected Books</h4>
<ul>
<% for(String aBook : selectedBooks){ %>
<li><%=aBook %></li>
<% } %>
</ul>
</body>
</html>