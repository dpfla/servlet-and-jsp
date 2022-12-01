<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//jsp에서는 자동으로 session 객체 가져오기 때문에 getSession() 사용X 
	String name=(String)session.getAttribute("name");
	session.setAttribute("address", "서울시 종로구");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 바인딩 실습</title>
</head>
<body>
	이름은 <%=name %> <br>
	<a href="session02.jsp">두번째 페이지로 이동</a>
</body>
</html>