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
	<h2>출력할 단을 입력해주세요</h2>
	<form action="guresult.jsp" method="post">
		단입력: <input type="text" name="dan"><br>
		<input type="submit" value="구구단 출력">
	</form>
</body>
</html>