<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*, jspEL01.ex01.MemberBean"
    isELIgnored="false"%>

<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="memBean" class="jspEL01.ex01.MemberBean"/>
<jsp:setProperty property="*" name="memBean"/>
<jsp:useBean id="memberList" class="java.util.ArrayList"/>
<%
	MemberBean memBean2 = new MemberBean("son", "1234", "손흥민", "song@gmail.com");
	memberList.add(memBean);
	memberList.add(memBean2);
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
			<td>${memberList[0].id }</td> 
			<td>${memberList[0].pwd }</td> 
			<td>${memberList[0].name }</td> 
			<td>${memberList[0].email }</td>
		</tr>
		<tr align="center">
			<td>${memberList[1].id }</td> 
			<td>${memberList[1].pwd }</td> 
			<td>${memberList[1].name }</td> 
			<td>${memberList[1].email }</td>
		</tr>
	</table>
</body>
</html>