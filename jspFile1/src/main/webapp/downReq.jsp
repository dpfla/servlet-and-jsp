<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다운로드 요청창</title>
</head>
<body>
	<form action="download.jsp" method="post">
		<input type="hidden" name="param1" value="logo.jpg">
		<input type="hidden" name="param2" value="back.png">
		<input type="submit" value="이미지 다운로드">
	</form>
</body>
</html>