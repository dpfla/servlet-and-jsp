package servletLink.ex04;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/showMember")
public class ShowMember extends HttpServlet {
	/*�α��� ������ �����ǰ� �ִ��� Ȯ��, ���*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String id="", pw="";
		Boolean isLogon=false;
		HttpSession session=request.getSession(false);
		//���� session������ ����, ������ null��ȯ
		if(session != null) {
			isLogon = (Boolean)session.getAttribute("isLogon");
			if(isLogon=true) {
				id=(String)session.getAttribute("log_id");
				out.print("<html><body>");
				out.print(id+"�� �α��εǾ��ֽ��ϴ�.");
				out.print("</body></html>");
			} else {
				response.sendRedirect("login3.html");
			}
		} else {
			response.sendRedirect("login3.html");
		}
	}

}
