<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Send an Omikuji!!</h1>
<form action="process" method="POST">
<table>
    <tr>
        <td>Pick any number from 5 to 25:</td>
    </tr>
    <tr>
        <td><select name="number" id="">
            <% for(int i = 5; i < 26 ; i++){%>
            <option value="<%=i%>"><%=i%></option>
            <%}%>
        </select></td>
    </tr>
    <tr>
        <td>Enter the name of any city:</td>
    </tr>
    <tr>
        <td><input type="text" name="city"></td>
    </tr>
    <tr>
        <td>Enter the name of any real person:</td>
    </tr>
    <tr>
        <td><input type="text" name="person"></td>
    </tr>
    <tr>
        <td>Enter professional endeavor or hobby:</td>
    </tr>
    <tr>
        <td><input type="text" name="hobby"></td>
    </tr>
    <tr>
        <td>Enter a type of a living thing:</td>
    </tr>
    <tr>
        <td><input type="text" name="thing"></td>
    </tr>
    <tr>
        <td>Say something nice to someone:</td>
    </tr>
    <tr>
        <td><textarea name="nice" id=""></textarea></td>
    </tr>
    <tr>
        <td><em>send and show to a friend</em></td>
    </tr>
</table>
    <button>Send</button>
</form>
</body>
</html>