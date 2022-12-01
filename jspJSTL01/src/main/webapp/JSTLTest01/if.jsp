<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<c:set var="id" value="hong" scope="page"/>
<c:set var="pwd" value="1234" scope="page"/>
<c:set var="name" value="홍길동" scope="page"/>
<c:set var="address" value="서울시 종로구" scope="page"/>
<c:set var="age" value="50" scope="page"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${id == 'hong' }">
		<h2>안녕하세요 ${name }</h2>
	</c:if>
	<c:if test="${age >= 65 }">
		<a href="http://www.naver.com">복지 확인</a>
	</c:if>
	
</body>
</html>