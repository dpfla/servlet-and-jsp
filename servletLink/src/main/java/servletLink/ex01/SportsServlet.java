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
			out.print("<p>로그인 정보가 확인되었습니다.</p>");
			out.print("<p>스포츠 중계 " + user_id + "로 댓글달기<p>");
		} else {
			out.print("<p>로그인 하지 않았습니다. 로그인해주세요</p>");
			out.print("<a href='/servletLink/login.html'>로그인 창으로 이동하기</a>");
			out.print("</body></html>");
		}
	}

}
