package servletForward.ex03;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/forward/viewMembers")
public class ViewServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandle(req, resp);
	}
	
	protected void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		List memberList=(List)req.getAttribute("memberList"); 
		out.print("<html><body>");
		out.print("<h3>ex04 Member</h3>");
		out.print("<table border=1>");
		out.print("<tr align='center' bgColor='#33ff66'>");
		out.print("<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th><th>가입날짜</th><th>삭제</th>");
		out.print("</tr>");
		for(int i=0; i<memberList.size(); i++) {
			MemberVO memberVO=(MemberVO)memberList.get(i);
			String id=memberVO.getId();
			String pwd=memberVO.getPwd();
			String name=memberVO.getName();
			String email=memberVO.getEmail();
			Date joinDate=memberVO.getJoinDate();
			out.print("<tr><td>" + id+"</td>"+"<td>"+pwd+"</td>"+"<td>"+name+"</td>"
					+"<td>"+email+"</td>"+"<td>"+joinDate+"</td>"
					+"<td><a href='/servletForward/forward/member?command=delMember&id="+id+"'>삭제</a></td></tr>");
		}
		out.print("</table>");
		out.print("<a href='/servletDB/memberForm.html'>회원 등록하기</a>");
		out.print("</body></html>");
	}
}
