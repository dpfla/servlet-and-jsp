<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String name=request.getParameter("name");
	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  
		<h2>이름 <%=name %></h2>
		<h2>나이 <%=age %></h2>
	-->
	<h2><% out.print("이름: " + name); %></h2>
	<h2><% out.print("나이: " + age); %></h2>
</body>
</html>