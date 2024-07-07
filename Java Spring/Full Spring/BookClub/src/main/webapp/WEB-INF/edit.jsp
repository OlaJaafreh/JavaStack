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
    <h1>Change your Entry</h1>
    <a href="/home">Back to the shelves</a>
    
            <div class="card bg-primary">
            <div class="card-body">
                <form:form action="/edit/${editBook.book_id}" method="post" modelAttribute="editBook">
                 <input type="hidden" name="_method" value="put">
                    <div class="form-group">
                        <form:label path="title">Title</form:label>
                        <form:input path="title" value="${ editBook.title }" class="form-control"/>
                        <form:errors path="title" class="text-warning"/>
                    </div>
                    <div class="form-group">
                        <form:label path="authorName">Title</form:label>
                        <form:input path="authorName" value="${editBook.authorName}" class="form-control"/>
                        <form:errors path="authorName" class="text-warning"/>
                    </div>
                    <div class="form-group">
                        <form:label path="userThoughts">Title</form:label>
                        <form:input path="userThoughts" value="${editBook.userThoughts}" class="form-control"/>
                        <form:errors path="userThoughts" class="text-warning"/>
                    </div>
                    <!-- Use btn-light class for light gray button -->
                    <button type="submit" class="btn btn-light">Submit</button>
                </form:form>
            </div>
        </div>

    
</body>
</html>
