<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String id = (String)request.getAttribute("id");
	String pwd = (String)request.getAttribute("pwd");
	String name = (String)session.getAttribute("name");
	String email = (String)application.getAttribute("email");
	//application만 member1.jsp에 바로 접속해도 데이터가 보인다.
	//application 단위로 데이터가 저장되기 때문에
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
			<td><%=id %></td> 
			<td><%=pwd %></td> 
			<td><%=name %></td> 
			<td><%=email %></td>
		</tr>
		<tr align="center">
			<td>${id }</td> 
			<td>${pwd }</td> 
			<td>${name }</td> 
			<td>${email }</td>
		</tr>
	</table>
</body>
</html>