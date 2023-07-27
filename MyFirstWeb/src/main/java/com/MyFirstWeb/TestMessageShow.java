package com.MyFirstWeb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Message;

public class TestMessageShow extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private List<Message> messages = new ArrayList<>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		// 將List物件設定為request的屬性
        request.setAttribute("messagesList", messages);
        
        // 導向到顯示留言的JSP
        request.getRequestDispatcher("showMessages.jsp").forward(request, response);
		
	}
	
	
}
