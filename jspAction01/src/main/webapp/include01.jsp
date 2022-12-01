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
		<jsp:param value="체스말" name="name"/>
		<jsp:param value="8.png" name="imgName"/>
	</jsp:include>
	<p> 체스말입니당 이게 나이트였나..?</p>
</body>
</html>