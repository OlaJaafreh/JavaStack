<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isErrorPage="true" %>    

   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
    <h1>Welcome, <c:out value="${book.title}"/></h1>
    <a href="/home">Back to the shelves</a>

    <div>
    
    
        <c:choose>
            <c:when test="${book.user.id == user.id}">
                <p>You read <c:out value="${book.title}"/> by <c:out value="${book.authorName}"/></p>
                <p>Here are your thoughts:</p>
                <p><c:out value="${book.userThoughts}"/></p>
            </c:when>
            <c:otherwise>
                <p><c:out value="${book.user.userName}"/> read <c:out value="${book.title}"/> by <c:out value="${book.authorName}"/></p>
                <p>Here are <c:out value="${book.user.userName}"/>'s thoughts:</p>
                <p><c:out value="${book.userThoughts}"/></p>
            </c:otherwise>
        </c:choose>
    </div>

    <c:if test="${book.user.id == user.id}">
        <a href="/book/${book.book_id}/edit"><input type="submit" value="Edit" class="btn btn-primary"/></a>
   </c:if>
 <c:if test="${book.user.id == user.id}">
    <form action="/book/${book.book_id}/delete" method="post" modelAttribute="book">
     <input type="hidden" name="_method" value="delete">
        <input type="submit" value="Delete" class="btn btn-danger"/>
    </form>
    </c:if>
</body>
</html>
