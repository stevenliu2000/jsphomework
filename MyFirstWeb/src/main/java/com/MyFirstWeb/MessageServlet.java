package com.MyFirstWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
    	// 設定回應的內容類型
    	request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
    	
        //嘗試去獲取表單資料
        String name = request.getParameter("name");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
    
        // 在伺服器控制台上輸出收到的資料
        System.out.println("收到訊息：" + name + " - " + title + " - " + content);
        
        
        // 傳送回應給客戶端
        response.setContentType("text/html;charset=UTF-8"); // 設定回應的Content-Type為HTML並使用UTF-8編碼
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>收到留言</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>收到留言</h1>");
        out.println("<p>填寫者：" + name + "</p>");
        out.println("<p>標題：" + title + "</p>");
        out.println("<p>內容：" + content + "</p>");
        out.println("</body>");
        out.println("</html>");
       }

}
