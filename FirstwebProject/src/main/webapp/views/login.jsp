<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="styleSheet"  href="/css/style.css">
</head>
<body>
<h3>Please Login here!!!</h3>
<a href="/regForm">If not registered</a>

<form action="logForm" method="post">

Email: <input type="text" name="email"><br/><br/><br/>
Password: <input type="password" name="password"><br/><br/><br/>
           <input type="submit" value="login">
</form>
</body>
</html>