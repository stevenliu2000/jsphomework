package com.MyFirstWeb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Message;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MessageServlet extends HttpServlet {
	
	private List<Message> messages = new ArrayList<>();


    @Override
    public void init() throws ServletException {
        super.init();
        messages = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("messages", messages);
        getServletContext().setAttribute("messages", messages);
        request.getRequestDispatcher("messages.jsp").forward(request, response);
    }
}
