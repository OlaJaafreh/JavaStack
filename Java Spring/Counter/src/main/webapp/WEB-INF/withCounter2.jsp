<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>You have visited <a href="/your_server">http://your_server <c:out value="${count}"></c:out> times</a> </p>
	<p><a href="/your_server">Test another visit?</a> </p>

</body>
</html>