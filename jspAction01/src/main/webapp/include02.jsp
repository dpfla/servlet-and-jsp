<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쇼핑몰</h1>
	<%--flush: 출력버퍼를 비울 것 인지 --%>
	<jsp:include page="img_include.jsp" flush="true">
		<jsp:param value="코스모스" name="name"/>
		<jsp:param value="bg4.jpg" name="imgName"/>
	</jsp:include>
	<p>이 꽃이 코스모스가 맞나..?</p>
</body>
</html>