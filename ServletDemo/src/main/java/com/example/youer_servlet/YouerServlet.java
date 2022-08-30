package com.example.youer_servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/youer")
public class YouerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 通过重定向路由到HelloServlet
         */
//        // 构造重定向的路径:
//        String name = request.getParameter("name");
//        String redirectToUrl = "./hello" + (name == null ? "" : "?name=" + name);
//        // 发送重定向响应:
//        response.sendRedirect(redirectToUrl);

        /**
         * 通过forward路由到HelloServlet
         */
        request.getRequestDispatcher("./hello").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
