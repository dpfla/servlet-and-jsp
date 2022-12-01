package servletLink.ex03;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginSession")
public class SessionTest3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);		
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession();

		
		String user_id=request.getParameter("user_id");
		String user_pw=request.getParameter("user_pw");
		
		if(session.isNew()) {
			if(user_id != null && user_id.length() != 0) {
				session.setAttribute("user_id", user_id);//(Ű, ��)
				/* Rewriting ���
				 String url=response.encodeURL("loginSession2");
				 out.print("<a href="+url+">�α��� ���� Ȯ��</a>"); 
				*/
				out.print("<a href='loginSession'>�α��� ���� Ȯ��</a>");
				
			} else {
				out.print("<a href='login2.html'>�ٽ� �α���</a>");
			}
		} else {
			user_id = (String)session.getAttribute("user_id");
			if(user_id != null && user_id.length() != 0) {
				out.print(user_id + "�� �α��� �Ǿ��ֽ��ϴ�.");
			} else {
				out.print("<a href='login2.html'>�ٽ� �α���</a>");
				session.invalidate();
			}
		}
	}
}
