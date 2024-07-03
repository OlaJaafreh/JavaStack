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
      
	
	<form:form modelAttribute="expensesDet">
	
    <p>
        <form:label class="form-label" path="name">Travel Name</form:label>
        "${ expensesDet.name}"
        
        
    </p>
    <p>
        <form:label class="form-label"  path="vendor">Vendor</form:label>
		"${ expensesDet.vendor}"
    </p>
    <p>
        <form:label class="form-label"  path="amount">Amount</form:label>
		"${ expensesDet.amount}"
    </p>
    <p>
        <form:label class="form-label"  path="description">Description</form:label>
	"${ expensesDet.description}"
    </p>    
    

</form:form>


	
	
	
</body>
</html>