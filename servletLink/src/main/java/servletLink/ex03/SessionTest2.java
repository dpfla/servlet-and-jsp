package servletLink.ex03;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sessiontest2")
public class SessionTest2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession();
		//session이 없으면 생성, 있으면 기존것 불러옴
		out.print("세션 아이디: " + session.getId() + "<br>");
		//id: String 타입
		out.print("최초 세션 생성 시간: " + new Date(session.getCreationTime()) + "<br>");
		out.print("최근 세션 접근 시간: " + new Date(session.getLastAccessedTime()) + "<br>");
		
		session.setMaxInactiveInterval(10);
		//초단위 세팅
		out.print("세션 유효 시간: " + session.getMaxInactiveInterval() + "<br>");
		//기본: 30분, 초단위
		//세션도 쿠키가 만들어진다.
		if(session.isNew()) {
			out.print("새 세션이 만들어졌습니다.");
		}
		session.invalidate(); //생성된 세션 객체 강제로 삭제 
	}
}
