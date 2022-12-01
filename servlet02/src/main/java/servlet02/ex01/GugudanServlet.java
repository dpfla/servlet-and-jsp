package servlet02.ex01;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/gugu")
public class GugudanServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter danOut=response.getWriter();
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		danOut.print("<html>");
		danOut.print("<body>");
		danOut.print("<table border=1 width=200 align=center>");
		danOut.print("<tr bgcolor='#cefbc9'>");
		danOut.print("<th colspan=2>** " + dan + "단 **</th>");
		danOut.print("</tr>");
		for(int i=1; i<=9; i++) {
			danOut.print("<tr align=center>"); //+ dan +" X " + i + " = " + i*dan +"</p>");
			danOut.print("<td width=100>" + dan +" X " + i +" </td>");
			danOut.print("<td width=100>" + i*dan +" </td>");
			danOut.print("</tr>");
		}
		danOut.print("</table>");
		danOut.print("<a href='http://localhost:8090/servlet02/gugudan.html'>돌아가기<a>");
		danOut.print("</body>");
		danOut.print("</html>");
	}

}
