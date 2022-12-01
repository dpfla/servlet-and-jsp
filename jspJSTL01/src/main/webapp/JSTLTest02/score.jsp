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
	<h2>시험점수를 입력해주세요</h2>
	<form action="sresult.jsp" method="post">
		시험점수: <input type="text" name="score"><br>
		<input type="submit" value="학점변환">
	</form>
</body>
</html>