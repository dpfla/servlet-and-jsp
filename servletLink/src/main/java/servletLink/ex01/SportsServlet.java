package servletLink.ex01;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sports")
public class SportsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		String user_id=request.getParameter("user_id");
		out.print("<html><body>");
		if(user_id != null && user_id.length() != 0) {
			out.print("<p>�α��� ������ Ȯ�εǾ����ϴ�.</p>");
			out.print("<p>������ �߰� " + user_id + "�� ��۴ޱ�<p>");
		} else {
			out.print("<p>�α��� ���� �ʾҽ��ϴ�. �α������ּ���</p>");
			out.print("<a href='/servletLink/login.html'>�α��� â���� �̵��ϱ�</a>");
			out.print("</body></html>");
		}
	}

}
