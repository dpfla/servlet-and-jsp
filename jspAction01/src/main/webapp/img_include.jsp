<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name=request.getParameter("name");
	String imgName=request.getParameter("imgName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>이름은 <%=name %></h2>
	<img src="./images/<%=imgName %>" alt="이미지 설명">
</body>
</html>