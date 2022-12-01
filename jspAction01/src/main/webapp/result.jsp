<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과창</title>
</head>
<body>
<%
	String msg="아이디를 입력하지 않았습니다. 아이디를 입력해주세요";
%>

	<%
		String id=request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		/*if(id.length() == 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}*/
		
		if(id.length() == 0) {
	%>
	<jsp:forward page="login.jsp">
		<jsp:param value="<%=msg %>" name="msg"/>
	</jsp:forward>
	<% 
		}
	%>
	<h2>아이디: <%=id %></h2>
</body>
</html>