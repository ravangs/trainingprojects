<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping Cart Here</title>
</head>
<body>
<h4> Selected Books</h4>
<c:forEach var="aBook" items="${selectedBooks}">
	<li>${aBook}</li>
</c:forEach>
<br>
<h4> Selected Bikes</h4>
<c:forEach var="aBike" items="${paramValues.bikes}">
	<li>${aBike}</li>
</c:forEach>
<br>
<h4> Selected Cars</h4>
<c:forEach var="aCar" items="${selectedCars}">
	<li>${aCar}</li>
</c:forEach>

</body>
</html>