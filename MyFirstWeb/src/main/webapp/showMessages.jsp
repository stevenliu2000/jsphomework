<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bean.Message" %> <!-- 導入Message類別的package -->
<%@ page import="java.util.List" %><!-- 導入List進來 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>留言列表</title>
</head>
<body>
    <h1>留言列表</h1>
    <ul>
        <% 
        List<Message> messages = (List<Message>) request.getAttribute("messagesList");
        if (messages != null) {
            for (Message message : messages) { 
        %>
            <li>
                <p>填寫者：<%= message.getName() %></p>
                <p>標題：<%= message.getTitle() %></p>
                <p>內容：<%= message.getContent() %></p>
            </li>
        <% 
            }
        } else {
        %>
            <li>目前還沒有留言。</li>
        <% 
        }
        %>
    </ul>
    <!-- 新增可以返回新增留言的方式，共有兩種可以透過超連結也可以透過按鈕 -->
    <form action="index.jsp">
        <input type="submit" value="返回新增留言">
    </form>
</body>
</html>
