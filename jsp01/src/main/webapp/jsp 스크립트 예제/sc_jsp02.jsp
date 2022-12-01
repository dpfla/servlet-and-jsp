<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! String name="김철수"; %>
<% String age=request.getParameter("age"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>9월 22일 수업</h2>
	<h2><%=name %></h2>
	<h2><%=age %>       <%=175 %></h2>
	<h2><%=Integer.parseInt(age)+10 %></h2>
</body>
</html>