<%@page import="java.util.*, jspJSTL01.ex01.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

%>
<c:redirect url="member.jsp">
	<c:param name="id" value="hong"/>
	<c:param name="pwd" value="1234"/>
	<c:param name="name" value="홍길동"/>
	<c:param name="email" value="hong@example.com"/>
</c:redirect>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반복문</title>
</head>
<body>

</body>
</html>