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
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr align="center" bgcolor="#ddd">
			<th>아이디</th> <th>비밀번호</th> <th>이름</th> <th>이메일</th>
		</tr>
		<tr align="center">
			<td>${param.id }</td> 
			<td>${param.pwd }</td> 
			<td>${param.name }</td> 
			<td>${param.email }</td>
		</tr>
	</table>
</body>
</html>