<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<%
		String msg=request.getParameter("msg");
		if(msg != null){
	%>
		<h2><%=msg %></h2>
	<%
		}
	%>
	<form action="result.jsp" method="post">
		아이디: <input type="text" name="user_id"><br>
		비밀번호: <input type="password" name="user_pw"><br>
		<input type="submit" value="로그인">
		<input type="reset" value="다시입력">
	</form>
</body>
</html>