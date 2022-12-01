package servletDB.ex04;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import oracle.security.o3logon.a;

@WebServlet("/ex04/member")
public class MemberServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandle(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandle(req, resp);
	}
	
	protected void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		MemberDAO dao=new MemberDAO();
		PrintWriter out=resp.getWriter();
		String command=req.getParameter("command");
		System.out.println("command 받기 전 : " + command);
		if(command != null && command.equals("addMember")) {
			String _id=req.getParameter("id");
			String _pwd=req.getParameter("pwd");
			String _name=req.getParameter("name");
			String _email=req.getParameter("email");
			
			MemberVO vo=new MemberVO();
			vo.setId(_id);
			vo.setPwd(_pwd);
			vo.setName(_name);
			vo.setEmail(_email);
			dao.addMember(vo);
		} else if(command != null && command.equals("delMember")) {
			String id=req.getParameter("id");
			dao.delMember(id);
		}
		List list=dao.listMembers();
		out.print("<html><body>");
		out.print("<h3>ex04 Member</h3>");
		out.print("<table border=1>");
		out.print("<tr align='center' bgColor='#33ff66'>");
		out.print("<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th><th>가입날짜</th><th>삭제</th>");
		out.print("</tr>");
		for(int i=0; i<list.size(); i++) {
			MemberVO memberVO=(MemberVO)list.get(i);
			String id=memberVO.getId();
			String pwd=memberVO.getPwd();
			String name=memberVO.getName();
			String email=memberVO.getEmail();
			Date joinDate=memberVO.getJoinDate();
			out.print("<tr><td>" + id+"</td>"+"<td>"+pwd+"</td>"+"<td>"+name+"</td>"
					+"<td>"+email+"</td>"+"<td>"+joinDate+"</td>"
					+"<td><a href='/servletDB/ex04/member?command=delMember&id="+id+"'>삭제</a></td></tr>");
		}
		out.print("</table>");
		out.print("<a href='/servletDB/memberForm.html'>회원 등록하기</a>");
		out.print("</body></html>");
	}

}
