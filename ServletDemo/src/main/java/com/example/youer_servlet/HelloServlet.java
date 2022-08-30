package com.example.youer_servlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user = (String) request.getSession().getAttribute("user");
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("X-Powered-By", "JavaEE Servlet");
        PrintWriter pw = response.getWriter();
        pw.write("<h1>Welcome, " + (user != null ? user : "Guest") + "</h1>");
        if (user == null) {
            // 未登录，显示登录链接:
            pw.write("<p><a href=\"./signin\">Sign In</a></p>");
        } else {
            // 已登录，显示登出链接:
            pw.write("<p><a href=\"./signout\">Sign Out</a></p>");
        }
        pw.flush();

    }

    public void destroy() {
    }
}