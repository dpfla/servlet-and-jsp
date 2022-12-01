<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setCharacterEncoding("utf-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<c:set var="price" value="350000"/>
		<fmt:formatNumber var="priceNum" value="${price }" type="number"/>
		상품가격: ${priceNum }원
	</h2>
	<h2>
		<c:set var="rate" value="0.2"/>
		<fmt:formatNumber var="rateNum" value="${rate }" type="percent"/>
		상품가격: ${rateNum }원
	</h2>
	<h2>
		<c:set var="price2" value="2300000"/>
		<fmt:formatNumber var="priceNum2" value="${price2 }" type="currency" currencySymbol="$"/>
		상품가격: ${priceNum2 }원
	</h2>
</body>
</html>