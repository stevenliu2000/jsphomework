<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>留言板</title>
</head>
<body>
    <h1>留言板</h1>

    <h2>留言列表</h2>
    <table>
        <tr>
            <th>填写者</th>
            <th>标题</th>
            <th>内容</th>
        </tr>
        <c:forEach var="message" items="${messages}">
            <tr>
                <td>${message.author}</td>
                <td>${message.title}</td>
                <td>${message.content}</td>
            </tr>
        </c:forEach>
    </table>

    <h2>添加留言</h2>
    <form method="post" action="addMessage">
        <label>填写者:</label>
        <input type="text" name="author" required><br>
        <label>标题:</label>
        <input type="text" name="title" required><br>
        <label>内容:</label>
        <textarea name="content" required></textarea><br>
        <input type="submit" value="提交">
    </form>
</body>