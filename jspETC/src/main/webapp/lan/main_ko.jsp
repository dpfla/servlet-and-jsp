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
<fmt:setLocale value="ko_KR"/> 
<!-- 로케이션을 한국어로 한다는 의미 -->
<a href="main_ko.jsp">한국어</a> <a href="main_en.jsp">영어</a>

<fmt:bundle basename="resource.member">
<!-- resource 패키지 안에 member.properties 파일 읽어온다 -->
	<h1><fmt:message key="mem.title"/></h1>
	<h2><fmt:message key="mem.name"/></h2>
	<h2><fmt:message key="mem.address"/></h2>
	<h2><fmt:message key="mem.job"/></h2>
	<!--  -->
</fmt:bundle>
<h2></h2>
</body>
</html>