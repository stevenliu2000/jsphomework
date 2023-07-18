package com.MyFirstWeb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Message;

import java.io.IOException;
import java.util.List;

public class AddMessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String author = request.getParameter("author");
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Message message = new Message();
        message.setAuthor(author);
        message.setTitle(title);
        message.setContent(content);

        List<Message> messages = (List<Message>) getServletContext().getAttribute("messages");
        messages.add(message);

        response.sendRedirect("messages");
    }
}

