<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="memBean" class="jspEL01.ex01.MemberBean"/>
<jsp:setProperty property="*" name="memBean"/>
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
			<td><%=memBean.getId() %></td> 
			<td><%=memBean.getPwd() %></td> 
			<td><%=memBean.getName() %></td> 
			<td><%=memBean.getEmail() %></td>
		</tr>
		<tr align="center">
			<td>${memBean.id }</td> 
			<td>${memBean.pwd }</td> 
			<td>${memBean.name }</td> 
			<td>${memBean.email }</td>
		</tr>
	</table>
</body>
</html>