package servletForward.ex01;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dispatchSecond")
public class DispatchSecondServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nameString=request.getParameter("name");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<p>DispatchFirst에서 forward() 이용하여 받음</p>");
		out.print("<p>이름: " + nameString + "</p>");
		out.print("</body></html>");
	}

}
