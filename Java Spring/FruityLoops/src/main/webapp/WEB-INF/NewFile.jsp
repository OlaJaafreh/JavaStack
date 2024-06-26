<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Fruity Loops</title>
</head>
<body>


<div class="container">
  <h1 style="color: #ffb6c2">Fruit Store</h1>
 
  <table class="table table-hover"  style="border: 8px solid #ffb6c2">
    <thead>
      <tr>
        <th>Name</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody>
      
      
      <c:forEach var="fruit" items="${fruits}">
      <c:choose>
        <c:when test="${fn:startsWith(fruit.name, 'G')}">
      <tr>
      
      
            
            <td style="color: orange;"><c:out value="${fruit.name}"></c:out></td>
        <td style="color: orange;"><c:out value="${fruit.price}"></c:out></td>
        </tr>
        </c:when>
        <c:otherwise>
         <tr>
           <td><c:out value="${fruit.name}"></c:out></td>
        <td ><c:out value="${fruit.price}"></c:out></td>

    
        
         </tr>
         
                 </c:otherwise>
    </c:choose>
    </c:forEach>
    
        

     
     
    </tbody>
  </table>
</div>


</body>
</html>