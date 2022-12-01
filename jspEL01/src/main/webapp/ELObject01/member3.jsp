<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*, jspEL01.ex02.*"
    isELIgnored="false"%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="memBean" class="jspEL01.ex02.MemberBean"/>
<jsp:setProperty property="*" name="memBean"/>

<jsp:useBean id="addr" class="jspEL01.ex02.Address"/>
<jsp:setProperty property="city" name="addr" value="서울"/>
<jsp:setProperty property="zipcode" name="addr" value="01234"/>

<%
	memBean.setAddr(addr);
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
			<th>아이디</th> <th>비밀번호</th> <th>이름</th> <th>이메일</th> <th>도시</th> <th>거주지</th>
		</tr>
		<tr align="center">
			<td>${memBean.id }</td> 
			<td>${memBean.pwd }</td> 
			<td>${memBean.name }</td> 
			<td>${memBean.email }</td>
			<td>${memBean.addr.city }</td>
			<td><%=memBean.getAddr().getZipcode() %></td>
		</tr>
		<tr align="center">
			<td>${memBean.id }</td> 
			<td>${memBean.pwd }</td> 
			<td>${memBean.name }</td> 
			<td>${memBean.email }</td>
			<td>${memBean.addr.city }</td>
			<td><%=memBean.getAddr().getZipcode() %></td>
		</tr>
	</table>
</body>
</html>