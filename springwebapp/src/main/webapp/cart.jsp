<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cart</title>
</head>
<body>

	<c:if test="${(empty(selectedBooks))}">
		<form action=addbooks >

			Book1 : <input type="checkbox" name="books" value="Book1" /><br />
			Book2 : <input type="checkbox" name="books" value="Book2" /><br />
			Book3 : <input type="checkbox" name="books" value="Book3" /><br />
			Book4 : <input type="checkbox" name="books" value="Book4" /><br />
			Book5 : <input type="checkbox" name="books" value="Book5" /><br />

			<input type=submit value="submit">
		</form>
	</c:if>

	<c:if test="${not(empty(selectedBooks)) and empty(selectedCars)}">
		<form action=addcars>

			Car1 : <input type="checkbox" name="cars" value="Car1" /><br />
			Car2 : <input type="checkbox" name="cars" value="Car2" /><br />
			Car3 : <input type="checkbox" name="cars" value="Car3" /><br />
			Car4 : <input type="checkbox" name="cars" value="Car4" /><br />
			Car5 : <input type="checkbox" name="cars" value="Car5" /><br /> 
			<input
				type=submit value="submit">

		</form>
	</c:if>

	<c:if
		test="${(not(empty(selectedBooks)) and not(empty(selectedCars))) and empty(selectedBikes)}">
		<form action=addbikes>

			Bike1 : <input type="checkbox" name="bikes" value="bike1" /><br />
			Bike2 : <input type="checkbox" name="bikes" value="bike2" /><br />
			Bike3 : <input type="checkbox" name="bikes" value="bike3" /><br />
			Bike4 : <input type="checkbox" name="bikes" value="bike4" /><br />
			Bike5 : <input type="checkbox" name="bikes" value="bike5" /><br />

			<input type=submit value="submit">

		</form>
	</c:if>

<c:if test="${(not(empty(selectedBooks)) and not(empty(selectedCars))) and not(empty(selectedBikes))}">
	<h2>Books</h2>
	<ul>
	<c:forEach var="book" items="${selectedBooks}">
	<li><c:out value="${book}"/>
	</c:forEach>
	</ul>
	
	<h2>Cars</h2>
	<ul>
	<c:forEach var="car" items="${selectedCars}">
	<li><c:out value="${car}"/>
	</c:forEach>
	</ul>
	
	<h2>Bikes</h2>
	<ul>
	<c:forEach var="bike" items="${selectedBikes}">
	<li><c:out value="${bike}"/>
	</c:forEach>
	</ul>
	
	<form action=invalidate>
	<input value="invalidate" type="submit">
	</form>
	

</c:if>

</body>
</html>