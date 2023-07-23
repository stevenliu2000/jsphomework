#這個是這段程式的Readme
##第一部分 新增了index.jsp的檔案
#### 這個是一開始進入網頁會進入到的頁面 網址是：http://localhost:8080/MyFirstWeb/
#### 我將新增留言的頁面html寫在這裡，並且也大致了解jsp有一點類似網頁的html但有一些語法不太一樣
#### 再來就是去讓新增可以導向另外一個頁面showMessage.jsp，在這裡我有使用	arraylist去將message 的資料以list的方式收集起來
#### 因為一開始使用兩個servlet溝通上出現一些問題，所以我先將檔案簡化，將一個一個步驟分開來，下方就是我先簡化的方式
``` Messageservlet.java // 傳送回應給客戶端
//        response.setContentType("text/html;charset=UTF-8"); // 設定回應的Content-Type為HTML並使用UTF-8編碼
//        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<meta charset=\"UTF-8\">");
//        out.println("<title>收到留言</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>收到留言</h1>");
//        out.println("<p>填寫者：" + name + "</p>");
//        out.println("<p>標題：" + title + "</p>");
//        out.println("<p>內容：" + content + "</p>");
//        out.println("</body>");
//        out.println("</html>");
```
#### 再來就是開始將東西補上
``` 
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
```
#### 最後在tomcat上遇到一些問題就是有關asj他會一直抱錯，所以最後在server.xml檔將那行註解就不會在跳出任何錯誤
