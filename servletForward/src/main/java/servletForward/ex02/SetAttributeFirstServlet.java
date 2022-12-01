package servletForward.ex02;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/setAttFirst")
public class SetAttributeFirstServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("first »£√‚µ ");
		request.setAttribute("name", "yerim");
		request.setAttribute("age", "25");
		RequestDispatcher dispatcher=request.getRequestDispatcher("setAttSecond");
		dispatcher.forward(request, response);
	}

}
