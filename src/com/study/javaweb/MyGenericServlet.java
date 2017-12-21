package com.study.javaweb;

import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;

import javax.naming.InitialContext;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class MyGenericServlet implements Servlet,ServletConfig,Serializable{
	private ServletConfig config;
	@Override
	public String getServletName() {
		// TODO Auto-generated method stub
		return config.getServletName();
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return config.getServletContext();
	}

	@Override
	public String getInitParameter(String name) {
		// TODO Auto-generated method stub
		return config.getInitParameter(name);
	}

	@Override
	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return config.getInitParameterNames();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
		init();
	}
	
	public abstract void init();

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return config.getServletContext().getServerInfo();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
