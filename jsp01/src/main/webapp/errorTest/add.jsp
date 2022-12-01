<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    errorPage="addException.jsp"%>
    <%--errorPage: 에러가 발생하면 설정한 페이지 열림 --%>
<%
	int num=Integer.parseInt(request.getParameter("num"));
	int sum = 0;
	
	for(int i=1; i<=num; i++){
		sum += i;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1부터 <%=num %>까지의 합은 <%=sum %>입니다.</h2>
</body>
</html>