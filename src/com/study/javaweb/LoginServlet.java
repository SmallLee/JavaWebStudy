package com.study.javaweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.util.StringParser;

public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6962872320533051270L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String method = req.getMethod();
//		System.out.println("method: "+method);
//		String requestURI = req.getRequestURI();///JavaWebStudy/login
//		System.out.println("requestURI: "+requestURI);
//		String queryString = req.getQueryString();
//		//username=root&password=1234
//		System.out.println("queryString: "+queryString);
//		String servletPath = req.getServletPath();
//		///login
//		System.out.println("servletPath: "+servletPath);
//		resp.setContentType("text/html;charset=utf-8");
		//·ÀÖ¹ÂÒÂë
//		resp.setCharacterEncoding("utf-8");
//		PrintWriter writer = resp.getWriter();
//		writer.write("ÄãºÃ");
		
		//ÉèÖÃÇëÇóÌåµÄ×Ö·û±àÂëÎªutf-8
//		req.setCharacterEncoding("utf-8");
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		System.out.println(username + "--" + password);
		String path = req.getServletPath();// /add.do
		String methodName = path.substring(1,path.indexOf("."));
		try {
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			method.invoke(this, req,resp);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	private void delete(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("====delete");
	}
}
