<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	try{
		int score=Integer.parseInt(request.getParameter("score"));
		String grade;
		
		if(score>=90) 
			grade="A";
		else if(score>=80) 
			grade="B";
		else if(score>=70) 
			grade="C";
		else if(score>=60) 
			grade="D";
		else
			grade="F";
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>시험 점수는 <%=score %>점 입니다.</p>
	<p>결과는 <%=grade %>학점입니다.</p>
	<a href="/jsp01/scoreResult.html">시험 점수 입력</a>
	<%
		} catch(NumberFormatException e){
	%>
			<p>숫자를 입력해주세요 </p>
			<a href="/jsp01/gugu.html">단수 입력</a>
	<%
		}
	%>
</body>
</html>