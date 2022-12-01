<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	String name="이예림";
	public String getName(){
		return name + "님 안녕하세요";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=name %></h1>
	<h1><%=getName() %></h1>
</body>
</html>