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

<table class="table table-hover">
  <thead>
    <tr>
     <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Age</th>

    </tr>
  </thead>
  <tbody>
   <c:forEach var="ninja" items="${Ninjas}">
       <tr>
      <td><c:out value="${ninja.ninjaFirstName}"></c:out></td>
      <td><c:out value="${ninja.ninjaLastName}"></c:out></td>
      <td><c:out value="${ninja.ninjaAge}"></c:out></td>
    </tr>

    </c:forEach>
    
  </tbody>
</table>



</body>
</html>