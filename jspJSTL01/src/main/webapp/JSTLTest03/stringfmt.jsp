<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="title" value="computer"/>
	<h2>
		문자열의 길이= ${fn:length(title) }
		문자를 대문자로 = ${fn:toUpperCase(title) }
		일부 문자열만 = ${fn:substring(title, 3, 6) }
		문자위치 = ${fn:indexOf(title, "put") }
		대체하기 = ${fn:replace(title, "o", "i") }
	</h2>
</body>
</html>