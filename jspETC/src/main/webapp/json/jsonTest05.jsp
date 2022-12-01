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
		console.log("${contextPath}");
		$("input").click(function() {
			$.ajax({
				type: "post",
				async: false,
				url: "${contextPath}/json2",
				success: function (data, textStatus){
					let jsonInfo=JSON.parse(data);
					let memInfo = "<h2>회원정보</h2>";
					
					for(let i in jsonInfo.member){
						memInfo += "<hr/>";
						memInfo += "<p>이름: "+jsonInfo.member[i].name+"</p>";
						memInfo += "<p>나이: "+jsonInfo.member[i].age+"</p>";
						memInfo += "<p>직업: "+jsonInfo.member[i].name+"</p>";
					}
					$("#output").html(memInfo);
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
	<input type="button" value="회원 정보 수신">
	<div id="output"></div>
	
</body>
</html>