package servlet02.ex01;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginTest")
public class LoginTest extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out=response.getWriter();
		String id=request.getParameter("user_id");
		String pw=request.getParameter("user_pw");
		
		if(id != null && (id.length() != 0)) {
			out.print("<html>");
			out.print("<body>");
			out.print("<p>" + id + "���� �α��� �ϼ̽��ϴ�.</p>");
			out.print("</body>");
			out.print("</html>");
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("<p>���̵� �Է����ּ���</p>");
			out.print("<a href='http://localhost:8090/servlet02/login3.html'>�α��� â���� �̵�</a>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
