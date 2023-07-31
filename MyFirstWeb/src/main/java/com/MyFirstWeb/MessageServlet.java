package com.MyFirstWeb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Message;

public class MessageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private List<Message> messages = new ArrayList<>();
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	
    	// 設定回應的內容類型
    	request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
    	
        //嘗試去獲取表單資料
        String name = request.getParameter("name");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        // 創建Message物件，代表一則留言
        Message message = new Message(name, title, content);

        // 將留言存儲到List中
        messages.add(message);
    
        // 在伺服器控制台上輸出收到的資料
        System.out.println("收到訊息：" + name + " - " + title + " - " + content);
        
        // 將List物件設定為request的屬性
        request.setAttribute("messagesList", messages);
        
        // 導向到顯示留言的JSP
        request.getRequestDispatcher("showMessages.jsp").forward(request, response);
       }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	
        request.setAttribute("messagesList", messages);
        request.getRequestDispatcher("showMessages.jsp").forward(request, response);
       }
}
