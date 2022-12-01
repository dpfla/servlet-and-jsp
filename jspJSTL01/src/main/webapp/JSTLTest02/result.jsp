<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty param.id }">
		<p>아이디를 입력하세요</p>
		<a href="login.jsp">로그인 화면으로 이동</a>
	</c:if>
	<c:if test="${not empty param.id}">
		<p>${param.id }님 환영합니다.</p>
	</c:if>
</body>
</html>