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
		\${30 ==30 }: ${30==30 } <br>
		\${"kbd" == "kbd" }: ${"kbd" eq "kbd" } <br>
		\${10 != 20}:${10 ne 20}<br>
		\${10 >  20}: ${10 gt 20}<br>
		\${10 <  20}: ${10 lt 20}<br>
		\${10 >= 20}: ${10 ge 20}<br>
		\${10 <= 20}: ${10 le 20}<br>
	</h2>
</body>
</html>