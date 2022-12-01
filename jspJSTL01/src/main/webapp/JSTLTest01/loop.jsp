<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
	List dataList = new ArrayList();
	dataList.add("홍길동");
	dataList.add("hi");
	dataList.add(25);
%>
<c:set var="list" value="<%=dataList %>" />
<c:set var="fruits" value="바나나,사과,포도,감" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반복문</title>
</head>
<body>
<%-- 
	<c:forEach var="i" begin="1" end="10" step="1" varStatus="loop" >
		<h2>${i } 반복횟수 ${loop.count}</h2>
	</c:forEach>
	
	<c:forEach var="data" items="${list }" varStatus="loop">
		<h2>list[${loop.index}] : ${data }</h2>
	</c:forEach>
--%>
	<c:forTokens var="token" items="${fruits}" delims=",">
		<h2><c:out value="${token }"/></h2>
		<%-- <h2>${token }</h2>--%>
	</c:forTokens>
</body>
</html>