<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"%>
    <%--isErrorPage: 다른 jsp페이지에서 예외가 발생하면 이 페이지 열겠다. 예외처리 담당 페이지로 지정 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>에러 내용</h2>
	<h3><%=exception.toString() %></h3>
	<%--exception: 내장객체 --%>
	<h3>숫자만 입력 가능합니다. <a href="adder.html">다시 실행하기</a></h3>
	
</body>
</html>