<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>

	<%-- <blink>
		Result:
		<%=request.getParameter("n1")%>
		<%=request.getParameter("op")%>
		<%=request.getParameter("n2")%>
		=
		<%=request.getAttribute("result")%>
	</blink> --%>

	<blink>Result : ${param.n1} ${param.op} ${param.n2} =
		${result}</blink>

</body>
</html>