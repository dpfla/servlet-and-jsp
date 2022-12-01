package servletDB.ex03;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ex03/member")
public class MemberServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		MemberDAO dao=new MemberDAO();
		List<MemberVO> list=dao.listMembers();
		
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<h3>ex03 Member</h3>");
		out.print("<table border=1>");
		out.print("<tr align='center' bgColor='#33ff66'>");
		out.print("<th>���̵�</th><th>��й�ȣ</th><th>�̸�</th><th>�̸���</th><th>���Գ�¥</th>");
		out.print("</tr>");
		for(int i=0; i<list.size(); i++) {
			String id=list.get(i).getId();
			String pwd=list.get(i).getPwd();
			String name=list.get(i).getName();
			String email=list.get(i).getEmail();
			Date joinDate=list.get(i).getJoinDate();
			out.print("<tr><td>" + id+"</td>"+"<td>"+pwd+"</td>"+"<td>"+name+"</td>"
					+"<td>"+email+"</td>"+"<td>"+joinDate+"</td></tr>");
		}
		out.print("</table></body></html>");
	}

}
