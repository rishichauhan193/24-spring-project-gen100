<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<center>
<h1 style="color:red">Ecom Home</h1>

<h2>Welcome,${user.firstName}</h2><br>

<img alt="" src="${user.profilePicPath}" height="100px" width="100px"/>
<br><br>

<button><a href="userproducts">Products</a></button>
</center>
</body>
</html>