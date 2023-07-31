package com.MyFirstWeb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Message;

public class TestMessageShow extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private List<Message> messages = new ArrayList<>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
 
//        // 假設這裡有幾筆測試用的留言資料
//        Message message1 = new Message(null, null, null);
//        message1.setName("Alice");
//        message1.setTitle("Hello");
//        message1.setContent("Hello, World!");
//
//        Message message2 = new Message(null, null, null);
//        message2.setName("Bob");
//        message2.setTitle("Greetings");
//        message2.setContent("Greetings from Bob!");
//
//        // 將留言資料加入List
//        messages.add(message1);
//        messages.add(message2);

//         將messages設定為request的屬性
        request.setAttribute("messagesList", messages);

		//先導向回去測試是復可以將訊息顯示出來
//		RequestDispatcher rd = request.getRequestDispatcher("MessageServlet");
//		rd.forward(request, response);
		
        // 導向到showMessages.jsp
        request.getRequestDispatcher("showMessages.jsp").forward(request, response);
	}
	
	
}
