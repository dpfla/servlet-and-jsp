<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 정보</h1>
	<%
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("user_id");
		String pw=request.getParameter("user_pw");
		if(id == null || id.length() == 0) {	
	%>
	<p>아이디를 입력하세요</p>
	<a href="/jsp01/login.html">로그인하기</a>
	<%
		} else if(id.equals("admin")) {
	%>
	<p>관리자로 로그인 했습니다.</p>
	<button>회원정보 삭제하기</button>
	<button>회원정보 수정하기</button>
	<%
		} else {
	%>
	<p>접속한 아이디: <%=id %></p>
	<%
		} 
	%>
</body>
</html>