<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Registration Form</title>
<link rel="styleSheet"  href="/css/style.css">
</head>
<body>
<h4>Register Here!!!</h4>
<a href="logForm">if already registered login here</a>

<form action="regForm" method="post">
Name: <input type="text" name="name"><br/><br/><br/>
Email: <input type="text" name="email"><br/><br/><br/>
Age: <input type="text" name="age"><br/><br/><br/>
Password: <input type="password" name="password"><br/><br/><br/>
           <input type="submit" value="register">
</form>
</body>
</html>