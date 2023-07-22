<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>留言板</title>
</head>
<body>
	<h1>留言板</h1>
	<form action="MessageServlet" method="get">
		<label for="name">填寫者:</label> <input type="text" name="name" required><br>
		<label for="title">標題:</label> <input type="text" name="title" required><br> 
		<label for="content">內容:</label><br>
		<textarea name="content" rows="4" cols="50" required></textarea>
		<br> <input type="submit" value="新增留言">
	</form>
</body>
</html>