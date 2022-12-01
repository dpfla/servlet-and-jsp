<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function() {
		let jsonData='{"member": [{"name": "홍길동", "age": 50, "job": "도적"},'
			+'{"name": "이영희", "age": 25, "job": "영업사원"},'
			+'{"name": "김철수", "age": 32, "job": "사무원"}]}';  
		//json 데이터가 이런 형태로 보통 이루어져있다
		//객체의 속성명도 "" 로 묶어줘야 한다, 속성값이 숫자면 "" 쓰지 않는다
		$("input").click(function() {
			let jsonInfo=JSON.parse(jsonData);
			let data = "<h2>회원 정보<h2>";
			
			for(let i in jsonInfo.member){
				data += "<hr/>";
				data += "<p>이름: " + jsonInfo.member[i].name + "</p>";
				data += "<p>나이: " + jsonInfo.member[i].age + "</p>";
				data += "<p>직업: " + jsonInfo.member[i].job + "</p>";	
			}
			$("#output").html(data);
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