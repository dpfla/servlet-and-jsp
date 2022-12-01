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
	<c:out value="<회원가입 정보&lt" escapeXml="false"/>
	<table border="1" align="center">
		<tr align="center" bgcolor="#ddd">
			<th>아이디</th> <th>비밀번호</th> <th>이름</th> <th>이메일</th>
		</tr>
		<tr align="center">
			<td><c:out value="${param.id }" default="값이 없습니다"></c:out></td> 
			<td><c:out value="${param.pwd }" default="값이 없습니다."></c:out></td> 
			<td><c:out value="${param.name }" default="값이 없습니다."></c:out></td> 
			<td><c:out value="${param.email }" default="값이 없습니다."></c:out></td>
		</tr>
	</table>
</body>
</html>