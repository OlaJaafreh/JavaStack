<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Burger Tracker</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <script type="text/javascript" src="/js/app.js"></script>
</head>
<body>

    
    <h1>Edit a Burger</h1>
    <a href="/burgers">Go Back</a>
    
<form:form action="/edit/${editBurger.id}" method="post" modelAttribute="editBurger">
    <input type="hidden" name="_method" value="put">
    
    <p>
        <form:label path="burgerName">Burger Name</form:label>
        <form:input type="text" path="burgerName" value="${editBurger.burgerName}" />
        <form:errors path="burgerName" />
    </p>
    <p>
        <form:label path="restName">Restaurant Name</form:label>
        <form:input path="restName" value="${editBurger.restName}" />
        <form:errors path="restName" />
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:input type="number" path="rating" value="${editBurger.rating}" />
        <form:errors path="rating" />
    </p>
    <p>
        <form:label path="notes">Notes</form:label>
        <form:textarea path="notes" value="${editBurger.notes}" />
        <form:errors path="notes" />
    </p>    
    <input type="submit" value="Submit" />
</form:form>

 <!-- Display Flash Messages -->
<%-- 	         <c:if test="${not empty errors}">
            <div class="alert alert-danger">
                <ul>
                    <c:forEach items="${errors}" var="error">
                        <li><c:out value="${error.defaultMessage}"/></li>
                    </c:forEach>
                </ul>
            </div>
        </c:if> --%>

</body>
</html>
