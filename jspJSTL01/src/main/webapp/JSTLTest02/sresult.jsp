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
	<p>시험점수: ${param.score }</p>
	<c:choose>
		<c:when test="${param.score>=0 && param.score<=100 }">
			<c:choose>
				<c:when test="${param.score >=90 }">
					<p>A 학점</p>
				</c:when>
				<c:when test="${param.score >=80 }">
					<p>B 학점</p>
				</c:when>
				<c:when test="${param.score >=70 }">
					<p>C 학점</p>
				</c:when>
				<c:when test="${param.score >=60 }">
					<p>D 학점</p>
				</c:when>
				<c:otherwise>
					<p>F 학점</p>
				</c:otherwise>
			</c:choose>
		</c:when>
		<c:otherwise>
			<p>점수를 잘못입력하셨습니다. 다시 입력해주세요</p>
			<a href="score.jsp">점수 입력 화면으로 이동</a>
		</c:otherwise>
	</c:choose>
</body>
</html>