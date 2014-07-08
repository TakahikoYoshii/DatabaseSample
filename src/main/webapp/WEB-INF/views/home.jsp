<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello DatabaseSample Application! 
</h1>


<form action="echo" method="post">
<button type="submit" name="home_echo" value="" >SQLページ</button>
</form>
<form action="data" method="get">
<button type="submit" name="home_data" value="" >次へ</button>
</form>

<hr>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
