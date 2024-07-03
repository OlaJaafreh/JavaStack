<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>New Ninja</h1>

<form:form action="/ninja/${ninja.id}" method="post" modelAttribute="ninja">
 
 	<div>
        <form:label path="ninjaFirstName">Dojo</form:label>
        <select id="options" name="options">
        
        <c:forEach var="oneDojo" items="${dojosFromMyController}">
        <option value="${oneDojo}">"${oneDojo}"</option>
    	</c:forEach>
        </select>
    </div>
    
    <div>
        <form:label path="ninjaFirstName">First Name</form:label>
        <form:errors path="ninjaFirstName"/>
        <form:input path="ninjaFirstName"/>
    </div>
    
    <div>
        <form:label path="ninjaLastName">Last Name</form:label>
        <form:errors path="ninjaLastName"/>
        <form:input path="ninjaLastName"/>
    </div>
    
    <div>
        <form:label path="ninjaAge">Age</form:label>
        <form:errors path="ninjaAge"/>
        <form:input type="number" path="ninjaAge"/>
    </div>
    

    
    <input type="submit" value="Create"/>
</form:form>


</body>
</html>