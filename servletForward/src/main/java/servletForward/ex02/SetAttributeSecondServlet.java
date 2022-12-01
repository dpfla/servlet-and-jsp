package servletForward.ex02;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/setAttSecond")
public class SetAttributeSecondServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String nameString=(String)request.getAttribute("name");
		String ageString=(String)request.getAttribute("age");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<p>setAttFirst에서 forward() 이용하여 받음</p>");
		out.print("<p>이름: " + nameString + "   나이: " + ageString + "</p>");
		out.print("</body></html>");
	}

}
