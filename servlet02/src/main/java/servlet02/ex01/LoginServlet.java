package servlet02.ex01;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//요청한 html의 charset과 같은 encoding 방식으로 설정, 한글은 encoding 방식이 다르면 깨져보임
		String user_id = request.getParameter("user_id");
		//request.getParameter(): input name의 전송된 값을 받아올 때
		String user_pw = request.getParameter("user_pw");

		System.out.println("아이디: " + user_id);
		System.out.println("비밀번호: " + user_pw);
	}

}
