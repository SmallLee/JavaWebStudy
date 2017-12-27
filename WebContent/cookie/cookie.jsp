<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		/* Cookie cookie = new Cookie("age","122");
		response.addCookie(cookie); */
		
		//获取并显示cookie
		Cookie[] cookies = request.getCookies();
		if(cookies != null && cookies.length > 0) {
			for(Cookie cookie : cookies) {
				out.println(cookie.getName()+""+cookie.getValue());
			}
		} else {
			out.println("没有Cookie，正在创建并返回");
			Cookie cookie = new Cookie("age","2112");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
	%>
</body>
</html>