<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function() {
		let jsonData='{"name": "홍길동", "age": 50, "job": "도적"}';
		console.log("${contextPath}");
		$("input").click(function() {
			$.ajax({
				type: "post",
				async: false,
				url: "${contextPath}/json",
				data: {jsonInfo: jsonData},
				success: function (data, textStatus){
					$("#output").append(data);
				},
				error: function(data, textStatus){
					alert("에러 발생");
				}
				
			});
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<input type="button" value="JSON 데이터 출력">
	<div id="output"></div>
	
</body>
</html>