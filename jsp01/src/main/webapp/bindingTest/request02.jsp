<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name=(String)request.getAttribute("name");
	String address = (String)request.getAttribute("address");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 바인딩 실습</title>
</head>
<body>
	<h2>이름 <%=name %></h2>
	<h2>주소 <%=address %></h2>
</body>
</html>