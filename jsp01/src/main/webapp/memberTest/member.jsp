<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    import="jsp01.ex02.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String _name = request.getParameter("name");
	MemberVO vo=new MemberVO();
	MemberDAO dao = new MemberDAO();
	vo.setName(_name);
	List memberList = dao.listMembers(vo);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 출력</title>
</head>
<body>
	<h1>회원 정보 출력</h1>
	<table border="1" width="700" align="center">
		<tr align="center" bgcolor="#FAF4C0">
			<th>아이디</th> <th>비밀번호</th> <th>이름</th> <th>이메일</th> <th>가입일</th>
		</tr>
		<%
			for(int i=0; i<memberList.size(); i++){
				MemberVO membervo=(MemberVO)memberList.get(i);
		%>
		<tr align="center">
			<td><%=membervo.getId() %></td> 
			<td><%=membervo.getPwd() %></td>
		 	<td><%=membervo.getName() %></td> 
			<td><%=membervo.getEmail() %></td> 
			<td><%=membervo.getJoinDate() %></td> 
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>