<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>
.head{
    background-color: red;
    color: blue;
    font-size:50px;
}
</style>
</head>
<body>
<span class="head">Welcome To Spring Boot Logic</span><br><br><br><br>
<form action="saveuser" method = "post">
FirstName:- <input type="text" name = "firstname"/><br><br>
Email:- <input type="email" name = "email"/><br><br>
Password:- <input type="password" name = "pass"/><br><br>

<input type="submit" value = "Signup" />
</form>
</body>
</html>