<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(function() {
		let jsonData='{"name": ["김철수", "홍길동", "이영희"]}';  
		//json 데이터가 이런 형태로 보통 이루어져있다
		//객체의 속성값이나 속성은 무조건""로 묶는다    '' X
		//객체의 속성명도 "" 로 묶어줘야 한다, 속성값이 숫자면 "" 쓰지 않는다
		$("input").click(function() {
			let jsonInfo=JSON.parse(jsonData);
			let data = "<h2>회원 이름<h2>";
			data += "<hr/>";
			for(let i in jsonInfo.name){
				data += jsonInfo.name[i] + "<br/>";
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