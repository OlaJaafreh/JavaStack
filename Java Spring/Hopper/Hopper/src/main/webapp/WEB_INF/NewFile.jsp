<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Customer Name:<c:out value="${Name}"/> </h1>
<h3>Item Name:<c:out value="${ItemName}"/></h3>
<h3>Price:$ <c:out value="${Price}"/></h3>
<h3>Description: <c:out value="${Description}"/></h3>
<h3>Vendor: <c:out value="${Vender}"/></h3>
</body>
</html>

	