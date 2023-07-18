package com.MyFirstWeb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Message;


@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	    private List<Message> messages;

	    @Override
	    public void init() throws ServletException {
	        super.init();
	        messages = new ArrayList<>();
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        request.setAttribute("messages", messages);
	        getServletContext().setAttribute("messages", messages);
	        request.getRequestDispatcher("messages.jsp").forward(request, response);
	    }
	}

