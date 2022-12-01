<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<c:set var="now" value="<%=new Date() %>" />
		<fmt:formatDate var="fnow" value="${now }" type="date" />
		<fmt:formatDate var="fnow" value="${now }" type="date" dateStyle="full"/>
		<fmt:formatDate var="fnow" value="${now }" type="time" timeStyle="full"/>
		오늘: ${fnow } <br>
		<fmt:formatDate var="fnow" value="${now }" type="both" />
		오늘: ${fnow }
	</h2>
	<h2>
		<c:set var="now" value="<%=new Date() %>" />
		<fmt:timeZone value="America/New York">
			뉴욕 현재 시간: <fmt:formatDate value="${now }" type="both" dateStyle="full" />
		</fmt:timeZone>
	</h2>
</body>
</html>