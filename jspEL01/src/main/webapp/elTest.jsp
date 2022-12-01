<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>표현 언어로 여러 데이터 형태 출력</h2>
	<h2>
		숫자값은 ${500} <br>
		문자값은 ${"안녕하세요" }<br>
		연산 => ${20+50 }<br>
		불린 => ${false }<br>
		실수값 => ${5.3 }<br>
		연산 => ${"10"+1}<br>
		<%-- 
			문자숫자 => ${"철수"+20 }<br>
			문자연결 => ${"철수" + "영희" } 
		--%>
	</h2>
</body>
</html>