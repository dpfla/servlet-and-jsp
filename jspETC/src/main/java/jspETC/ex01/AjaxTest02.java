package jspETC.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ajax2")
public class AjaxTest02 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("test/html;charset=utf-8");		
		PrintWriter out=response.getWriter();
		//html ajax에서 형식을 XML로 지정해놨기 때문에 out.print로 보내는 정보를 XML로 인식한다
		out.print("<main>");
		
		out.print("<book>");
		out.print("<title>Node.js 프로그래밍</title>");
		out.print("<writer>한빛미디어 / 윤인성</writer>");
		out.print("<image>http://localhost:8090/jspETC/images/node.jpg</image>");
		out.print("</book>");
		
		out.print("<book>");
		out.print("<title>실시간 사용자 경험 프로그래밍</title>");
		out.print("<writer>한빛미디어 / 테드 로덴</writer>");
		out.print("<image>http://localhost:8090/jspETC/images/ux.gif</image>");
		out.print("</book>");
		
		out.print("</main>");
	}

}
