package com.study.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6962872320533051270L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getMethod();
		System.out.println("method: "+method);
		String requestURI = req.getRequestURI();///JavaWebStudy/login
		System.out.println("requestURI: "+requestURI);
		String queryString = req.getQueryString();
		//username=root&password=1234
		System.out.println("queryString: "+queryString);
		String servletPath = req.getServletPath();
		///login
		System.out.println("servletPath: "+servletPath);
		PrintWriter writer = resp.getWriter();
		writer.write("hello");
	}
}
