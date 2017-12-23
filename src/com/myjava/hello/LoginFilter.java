package com.myjava.hello;

import javax.servlet.*;

import java.io.IOException;
/**
 * 登陆接口的过滤器 再请求之前过滤请求的地址 请求的接口必须要满足特定的需求 否则不让通过
 * 
 * @author Administrator
 *
 */

public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest requst, ServletResponse respone, FilterChain arg2)
			throws IOException, ServletException {
		String name = requst.getParameter("us");

		if (!"123".equals(name)) {// 过如果用户名不是 123 则不让登陆通过
			respone.setContentType("text/html;charset=UTF-8");
			respone.getWriter().print("请求不成功！");
		}else{
			arg2.doFilter(requst,respone);
		}
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
