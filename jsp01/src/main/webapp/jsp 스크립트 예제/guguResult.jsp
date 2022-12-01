<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		try{
			if((request.getParameter("dan") != "") || request.getParameter("dan").length() != 0){
				int dan=Integer.parseInt(request.getParameter("dan"));
	%>

	<p>** <%=dan %>단 **</p>
	<%
		for(int i=1; i<=9; i++){
	%>
	<p> <%=i %> X <%=dan %> = <%=i*dan %></p>
	<%
		}
	%>
	<a href="/jsp01/gugu.html">단수 입력</a>
	<%
		} else {
	%>
	<p> 단을 입력해주세요 </p>
	<a href="/jsp01/gugu.html">단수 입력</a>
	<%
			}
		} catch(NumberFormatException e){
	%>
			<p>숫자를 입력해주세요 </p>
			<a href="/jsp01/gugu.html">단수 입력</a>
	<%
		}
	%>
	
</body>
</html>