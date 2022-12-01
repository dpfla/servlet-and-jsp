package jsp01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/session01")
public class Session01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		session.setAttribute("name", "ȫ�浿");
		
		out.print("<html><body>");
		out.print("<h1>���ǿ� �̸��� ���ε��մϴ�.</h1>");
		out.print("<a href='/jsp01/bindingTest/session01.jsp'>ù ��° �������� �̵��ϱ�</a>");
		out.print("</body></html>");
	}

}
