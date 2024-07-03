<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


</head>
<body>


	<h1>Edit</h1>
	
	<a href="/expenses">Go Back</a>
      
      
      
	
	<form:form action="/edit/${expensesEdit.id}" method="post" modelAttribute="expensesEdit">
	 <input type="hidden" name="_method" value="put">
    <p>
        <form:label class="form-label" path="name">Travel Name</form:label>
        <form:input class="form-control" id="formControlInput" type="text" path="name" value="${ expenseee.name}"/>
        <form:errors path="name"/>
        
        
    </p>
    <p>
        <form:label class="form-label"  path="vendor">Vendor</form:label>
        <form:input class="form-control" id="formControlInput"  path="vendor"  value="${ expenseee.vendor}"/>
        <form:errors path="vendor"/>
    </p>
    <p>
        <form:label class="form-label"  path="amount">Amount</form:label>
        <form:input class="form-control" id="formControlInput"  type="number" path="amount"  value="${ expenseee.amount}"/>
        <form:errors path="amount"/>
    </p>
    <p>
        <form:label class="form-label"  path="description">Description</form:label>
        <form:textarea class="form-control" id="formControlInput"  path="description"  value="${ expenseee.description}"/>
        <form:errors path="description"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>


	
	
	
</body>
</html>