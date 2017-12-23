package com.myjava.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ErrorHandler 错误处理 ErrorHandlerServlet
 */
@WebServlet("/ErrorHandlerServlet")
public class ErrorHandlerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorHandlerServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应内容类型
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//		// 实际的逻辑是在这里
//		response.sendRedirect("404.html");

        //网址重定向
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");

        // 要重定向的新位置
        String site = new String("404.html");

        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location", site);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
