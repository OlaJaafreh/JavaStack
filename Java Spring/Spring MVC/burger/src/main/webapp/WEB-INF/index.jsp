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
    <div class="container mt-5">
        <h1 class="mb-4">Burger Tracker</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Burger Name</th>
                    <th>Restaurant Name</th>
                    <th>Rating(out of 5)</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach  var="Myburger" items="${burger}">
                    <tr>
                        <td>${Myburger.burgerName}</td>
                        <td>${Myburger.restName}</td>
                        <td>${Myburger.rating}</td>
                        <td><a href="/burgers/${Myburger.id} ">edit</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    
    <h1>Add a Burger</h1>
    
<form:form action="/burgerss" method="post" modelAttribute="newBurger">
    <p>
        <form:label path="burgerName">Burger Name</form:label>
        <form:input type="text" path="burgerName"/>
        <form:errors path="burgerName"/>
    </p>
    <p>
        <form:label path="restName">Restaurant Name</form:label>
        <form:input path="restName"/>
        <form:errors path="restName"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:input type="number" path="rating"/>
        <form:errors path="rating"/>
    </p>
    <p>
        <form:label path="notes">Notes</form:label>
        <form:textarea path="notes"/>
        <form:errors path="notes"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>

 <!-- Display Flash Messages -->
        <c:if test="${not empty errors}">
            <div class="alert alert-danger">
                <ul>
                    <c:forEach items="${errors}" var="error">
                        <li><c:out value="${error.defaultMessage}"/></li>
                    </c:forEach>
                </ul>
            </div>
        </c:if>

</body>
</html>
