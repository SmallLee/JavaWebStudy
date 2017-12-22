<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <%request.getRequestDispatcher("/jsp/simple.jsp").forward(request, response);
	%> 
	<%pageContext.forward("/jsp/simple.jsp"); %> --%>
	<jsp:forward page="/jsp/simple.jsp">
		<jsp:param value="abcd" name="name"/>
	</jsp:forward>
</body>
</html>