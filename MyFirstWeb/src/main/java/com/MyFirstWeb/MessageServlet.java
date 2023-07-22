package com.MyFirstWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doget(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
    	//嘗試去獲取表單資料
    	String name = request.getParameter("name");
    	String title = request.getParameter("title");
    	String content = request.getParameter("content");
    	
    	String totle = name+title+content;
    	
    	PrintWriter out = response.getWriter();
    	
    	out.println("the respond message" +totle);
    	
    }
    
    
//    private ArrayList<Message> messages = new ArrayList<>();
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//    	
//        // 獲取表單資料
//        String name = request.getParameter("name");
//        String title = request.getParameter("title");
//        String content = request.getParameter("content");
//
//        // 新增留言
//        Message message = new Message();
//        message.setName(name);
//        message.setTitle(title);
//        message.setContent(content);
//        messages.add(message);
//
//        // 重定向至顯示留言列表的 JSP 頁面
//        response.sendRedirect("MessageList.jsp");
//    }
}

