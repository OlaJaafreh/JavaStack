<!-- Here we have to import the Date class. -->
<!-- You will put the import in the first line of the jsp tag. Use the import attribute -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
    
        <script type="text/javascript" src="/js/date.js"></script>
        
        <meta charset="UTF-8">
        <title>Date</title>
    </head>
<body>
    <p>
    <c:out value="${FinaldateFormat}"></c:out>
    </p>
    
</body>
</html>



