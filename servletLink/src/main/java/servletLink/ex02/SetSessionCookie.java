package servletLink.ex02;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/setSessionCookie")
public class SetSessionCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Date date=new Date();
		Cookie cookie=new Cookie("cookieTest2", URLEncoder.encode("9월 20일 낮 기온은 23도", "utf-8"));
		//한글을 넣으면 깨져보임 -> URLEncoder.encode() 사용
		cookie.setMaxAge(-1); // 음수로 설정 시 session 쿠키
		response.addCookie(cookie);
		out.print("쿠키 생성된 시간: " + date);
		out.print("<br>쿠키가 저장되었습니다.");
	}

}
