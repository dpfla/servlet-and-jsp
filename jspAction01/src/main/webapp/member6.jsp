<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*,jspAction01.ex01.*"%>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="memBean" class="jspAction01.ex01.MemberBean" scop="page"/>

<%-- 
	<jsp:useBean id="생성할 객체 이름(빈이름)" 
		class="패키지 이름을 포함한 자바 클래스" 
		scope="접근범위(기본:페이지)">
	</jsp:useBean>  : 객체 생성하는 태그
--%>
<%
	
	String command=request.getParameter("command");
	MemberDAO dao=new MemberDAO();
	
	if(command != null && command.equals("addMember")){
%>
	<jsp:setProperty property="*" name="memBean"/>
<%-- 동일
	<jsp:setProperty property="id" name="memBean"/>
	<jsp:setProperty property="pwd" name="memBean"/>
	<jsp:setProperty property="name" name="memBean"/>
	<jsp:setProperty property="email" name="memBean"/>
 --%>

<%-- 
	<jsp:setProperty property="설정할 속성 이름" name="속성을 설정할 객체" param="getParameter에 넣는 파라미터 이름"/>
	<jsp:setProperty property="속성이름" name="memBean"/> : 속성이름과 파람값이 같다면 생략 가능
	<jsp:setProperty property="*" name="memBean"/>: 객체의 멤버변수와 이름이 같은 값을 속성으로 맴핑해준다.
--%>
<%
		dao.addMember(memBean);
	}  else if(command != null && command.equals("delMember")){
		String id=request.getParameter("id");
		dao.delMember(id);
	}
	List memberList = dao.listMembers();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">회원 목록</h2>
	<table border="1" align="center">
		<tr align="center" bgcoor="#ccc">
			<th>아이디</th> <th>비밀번호</th> <th>이름</th> <th>이메일</th> <th>가입일자</th> <th>삭제</th>
		</tr>
	<%
		if(memberList.size() == 0){
	%>
		<tr><td colspan="5"> <p align="center"> 등록된 회원이 없습니다.</p> <td></tr>
	<%
		}else{
			for(int i=0;i<memberList.size();i++){
				MemberBean bean = (MemberBean)memberList.get(i);
	%>
		<tr align="center">
			<td><%=bean.getId() %></td>
			<td><%=bean.getPwd() %></td>
			<td><%=bean.getName() %></td>
			<td><%=bean.getEmail() %></td>
			<td><%=bean.getJoinDate() %></td>
			<td><a href="/jspAction01/member.jsp?command=delMember&id=<%=bean.getId()%>">삭제</a></td>
		</tr>
	<%
			}
		}
	%>
	</table>
	<a href="/jspAction01/memberForm.html">회원 등록하기</a>
</body>
</html>