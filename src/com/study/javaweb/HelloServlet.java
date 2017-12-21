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
		//��ȡȫ�ֳ�ʼ������
		String username = servletContext.getInitParameter("username");
		String password = servletContext.getInitParameter("password");
		System.out.println(username+"--"+password);
		//��ȡServlet��ע������
		String servletName = config.getServletName();
		System.out.println(servletName);
		//��ȡĳ���ļ��ڷ������ϵľ���·��
		String realPath = servletContext.getRealPath("/note.txt");
		System.out.println(realPath);
		//��ȡ��ʼ������
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
