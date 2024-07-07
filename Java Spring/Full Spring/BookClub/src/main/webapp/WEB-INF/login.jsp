<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration and Login</title>
    <!-- Bootstrap CSS -->
    <!-- <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet"> -->
    <link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

<h1>Welcome</h1>
    <div class="container">
        <!-- Registration Form -->
        <div class="card bg-primary">
            <div class="card-body">
                <h1 class="reg">Registration</h1>
                <form:form action="register" method="POST" modelAttribute="newUser">
                    <div class="form-group">
                        <form:label path="userName">Name</form:label>
                        <form:input path="userName" class="form-control"/>
                        <form:errors path="userName" class="text-warning"/>
                    </div>
                    <div class="form-group">
                        <form:label path="email">Email</form:label>
                        <form:input path="email" class="form-control"/>
                        <form:errors path="email" class="text-warning"/>
                    </div>
                    <div class="form-group">
                        <form:label path="password">Password</form:label>
                        <form:password path="password" class="form-control"/>
                        <form:errors path="password" class="text-warning"/>
                    </div>
                    <div class="form-group">
                        <form:label path="confirm">Confirm Password</form:label>
                        <form:password path="confirm" class="form-control"/>
                        <form:errors path="confirm" class="text-warning"/>
                    </div>
                    <!-- Use btn-light class for light gray button -->
                    <button type="submit" class="btn btn-light">Register</button>
                </form:form>
            </div>
        </div>

        <!-- Login Form -->
        <div class="card bg-primary">
            <div class="card-body">
                <h1>Login</h1>
                <form:form action="login" method="POST" modelAttribute="newLogin">
                    <div class="form-group">
                        <form:label path="emailLog">Email</form:label>
                        <form:input path="emailLog" class="form-control"/>
                        <form:errors path="emailLog" class="text-warning"/>
                    </div>
                    <div class="form-group">
                        <form:label path="pass">Password</form:label>
                        <form:password path="pass" class="form-control"/>
                        <form:errors path="pass" class="text-warning"/>
                    </div>
                    <!-- Use btn-light class for light gray button -->
                    <button type="submit" class="btn btn-light">Log In</button>
                </form:form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
