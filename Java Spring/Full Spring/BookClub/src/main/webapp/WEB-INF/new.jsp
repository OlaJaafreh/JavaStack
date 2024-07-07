<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add a Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <h1>Add a Book to Your Shelf!</h1>
        <a href="/home" class="btn btn-secondary mb-3">Back to the shelves</a>

        <div class="card">
            <div class="card-body">
                <form:form action="/shelfAdd" method="POST" modelAttribute="newBook">
                    <div class="form-group mb-3">
                        <form:label path="title">Title</form:label>
                        <form:input path="title" class="form-control"/>
                        <form:errors path="title" class="text-warning"/>
                    </div>
                    <div class="form-group mb-3">
                        <form:label path="authorName">Author Name</form:label>
                        <form:input path="authorName" class="form-control"/>
                        <form:errors path="authorName" class="text-warning"/>
                    </div>
                    <div class="form-group mb-3">
                        <form:label path="userThoughts">Thoughts</form:label>
                        <form:textarea path="userThoughts" class="form-control"/>
                        <form:errors path="userThoughts" class="text-warning"/>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>
