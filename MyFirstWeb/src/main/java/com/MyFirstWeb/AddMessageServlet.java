package com.MyFirstWeb;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Message;

/**
 * Servlet implementation class AddMessageServlet
 */
@WebServlet("/AddMessageServlet")
public class AddMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String author = request.getParameter("author");
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        Message message = new Message();
        message.setAuthor(author);
        message.setTitle(title);
        message.setContent(content);

        // Add message to the list
        List<Message> messages = (List<Message>) getServletContext().getAttribute("messages");
        messages.add(message);

        response.sendRedirect("messages");
    }
}
