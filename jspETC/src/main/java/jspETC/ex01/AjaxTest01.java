package jspETC.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ajax1")
public class AjaxTest01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("test/html;charset=utf-8");
		String param=(String)request.getParameter("param");
		//Ajax로 전송된 데이터를 pram에 담아서 보냄
		System.out.println("param: " + param);
		
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<p>안녕하세요 오늘은 월요일입니다</p>");
		out.print("</body></html>");
		//프린트값이 전송된다
	}
}
