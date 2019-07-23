<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator here</title>
</head>
<body>
<form action="calculator">
Number1 <input name=op1> <br>
Number2 <input name=op2> <br>

<input name=operation value="+" type=submit>
<input name=operation value="-" type=submit>
<input name=operation value="*" type=submit>
<input name=operation value="/" type=submit>
</form>

<c:if test="${not(empty(result))}">
Result : ${param.op1} ${param.operation} ${param.op2} =  ${result}
</c:if>

</body>
</html>