package com.study.javaweb;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("h constructor...");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init...");
		ServletContext servletContext = config.getServletContext();
		//获取全局初始化参数
		String username = servletContext.getInitParameter("username");
		String password = servletContext.getInitParameter("password");
		System.out.println(username+"--"+password);
		//获取Servlet的注册名称
		String servletName = config.getServletName();
		System.out.println(servletName);
		//获取某个文件在服务器上的绝对路径
		String realPath = servletContext.getRealPath("/note.txt");
		System.out.println(realPath);
		//获取初始化参数
		String url = config.getInitParameter("url");
		String driverClass = config.getInitParameter("driverClass");
		System.out.println(url+"--"+driverClass);
		
		String contextPath = servletContext.getContextPath();
		///JavaWebStudy
		System.out.println("contextPath:  "+contextPath);
	}
	public void destroy() {
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null; 
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
