<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bean.Message"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>留言板</h1>
	<form action="MessageServlet" method="post" id="messageForm">
		<label for="name">填寫者:</label> <input type="text" name="name" required><br>
		<label for="title">標題:</label> <input type="text" name="title"
			required><br> <label for="content">內容:</label><br>
		<textarea name="content" rows="4" cols="50" required></textarea>
		<br> <input type="submit" value="新增留言">

	</form>

	<form action="MessageServlet" method="Get" id="showMessagesForm">
		<input type="submit" value="查看所有留言">
	</form>

	<!-- <script>
		document.getElementById("showMessagesForm").addEventListener("submit",
				function(event) {
					event.preventDefault();  /* 阻止表單的默認提交行為 */ 
					window.location.href = "showMessages.jsp"; /* 使用JavaScript進行導向 */ 
				});
	</script> -->


	<button type="button" onclick="clearFields()">清除欄位</button>
	<script>
		function clearFields() {
			console.log("按鈕確實被點擊了") /* 確認這個按鈕有被點擊 */
			document.getElementById("messageForm").reset();/* 在上面的表單裡面新增id可以方便地去直接將所有欄位清除 */
		}
	</script>
</body>
</html>
<!--  預設網址 -->
<!--  http://localhost:8080/MyFirstWeb/ -->