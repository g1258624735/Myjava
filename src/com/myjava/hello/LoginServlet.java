package com.myjava.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloHttp
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置刷新自动加载的事件间隔为 5 秒
//		response.setIntHeader("Refresh", 5);
		// 设置响应内容类型
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		// 实际的逻辑是在这里
		PrintWriter out = response.getWriter();
//		out.println("{list:[{img:https://gss0.bdstatic.com/5bVWsj_p_tVS5dKfpU_Y_D3/res/r/image/2017-09-27/fffef0968bcf267bb40762596a4141d0.jpg,name:小军}]}");
//		out.println("{\"list\":[{\"img\":\"http://p3.pstatp.com/large/249a0000950f774cc565\",\"name\":\"xiaomin\"},{\"img\":\"http://p3.pstatp.com/large/249a0000950f774cc565\",\"name\":\"xiaomin\"}]}");
		out.println("你登录的用户名："+request.getParameter("us")+"<br/>你的登录密码："+request.getParameter("psd"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
