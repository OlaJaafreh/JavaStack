<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>


<h1>Welcome, "${user.userName}"</h1>

<p>Books from everyone's shelves:</p>

<a href="/logout">logout</a>

<a href="/books/new">+ Add q to my shelf!</a>



<div class="table">
<table>
<tr>
    <th scope="col">ID</th>
    <th scope="col">Title</th>
    <th scope="col">Author Name</th>
    <th scope="col">Posted By</th>
  </tr>
  
  <c:forEach var="book" items="${books}">
  <tr>
  	<th scope="row"><c:out value="${book.book_id}"/></th>
    <td><a href="/book/${book.book_id}"><c:out value="${book.title}"/></a></td>
    <td><c:out value="${book.authorName}"/></td>
    <td><c:out value="${book.user.userName}"/></td>
  </tr>
  </c:forEach>

</table>
                        
                        
    


</div>
</body>
</html>