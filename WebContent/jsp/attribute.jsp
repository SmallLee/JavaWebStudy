<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@include file="simple.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- 动态引入 -->
	<%pageContext.setAttribute("name", "张三"); 
		application.setAttribute("age", 12);
	%>
	
	<%=pageContext.getAttribute("age")%>
	<%=pageContext.findAttribute("age")%>
<% //application.getRequestDispatcher("/jsp/simple.jsp").forward(request, response);%>
	<% //request.getRequestDispatcher("simple.jsp").forward(request, response);%>
	<%=request.getContextPath()%><!--/JavaWebStudy  -->
	<% //response.sendRedirect("simple.jsp");%>
	<% //response.sendRedirect("/JavaWebStudy/jsp/simple.jsp");%>
</body>
</html>