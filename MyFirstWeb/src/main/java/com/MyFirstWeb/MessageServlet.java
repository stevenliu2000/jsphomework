package com.MyFirstWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

}
