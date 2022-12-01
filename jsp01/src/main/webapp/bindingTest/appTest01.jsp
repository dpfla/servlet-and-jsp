<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	session.setAttribute("name", "롸롸롸");
	application.setAttribute("address", "서울시 영등포구");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>애플리케이션 바인딩</title>
</head>
<body>
	<h2>이름은 세션객체, 주소는 애플리케이션 객체</h2>
	<a href="appTest02.jsp">두번째 웹 페이지로 이동</a>
</body>
</html>