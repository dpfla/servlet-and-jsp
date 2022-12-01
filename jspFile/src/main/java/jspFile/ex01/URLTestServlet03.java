package jspFile.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class URLTestServlet03 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String context= request.getContextPath();
		String urlString=request.getRequestURL().toString();
		// 클라이언트가 입력한 URL전부 가져옴
		String mappingString = request.getServletPath();
		//매핑 이름 가져옴
		String uriString = request.getRequestURI().toString();
		//url에서 서버주소 제외한 값
		out.print("<html><body bgcolor='cyan'>");
		out.print("<p>URLTestServlet03</p>");
		out.print("<p> 컨텍스트 이름: " + context + "</p>");
		out.print("<p> 전체 경로 (URL): " + urlString + "</p>");
		out.print("<p> 매핑이름: " + mappingString + "</p>");
		out.print("<p> URI: " + uriString + "</p>");
		out.print("</body></html>");
	}

}
