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

@WebServlet("/setcookie")
public class SetCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		Date date=new Date();
		Cookie cookie=new Cookie("cookieTest", URLEncoder.encode("오늘 기온은 23도", "utf-8"));
		//한글을 넣으면 깨져보임 -> URLEncoder.encode() 사용
		cookie.setMaxAge(24*60*60); // 초 단위로 설정 가능
		response.addCookie(cookie);
		out.print("쿠키 생성된 시간: " + date);
		out.print("<br>쿠키가 저장되었습니다.");
	}

}
