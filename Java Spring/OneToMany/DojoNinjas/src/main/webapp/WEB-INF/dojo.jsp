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

<h1>New Dojo</h1>

<form:form action="/dojos/new" method="post" modelAttribute="dojo">
 
    <div>
        <form:label path="dojoName">Name</form:label>
        <form:errors path="dojoName"/>
        <form:input path="dojoName"/>
    </div>
    

    
    <input type="submit" value="Create"/>
</form:form>


</body>
</html>