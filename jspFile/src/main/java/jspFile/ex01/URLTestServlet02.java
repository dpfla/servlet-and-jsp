package jspFile.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/first/*")
public class URLTestServlet02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String context= request.getContextPath();
		String urlString=request.getRequestURL().toString();
		// Ŭ���̾�Ʈ�� �Է��� URL���� ������
		String mappingString = request.getServletPath();
		//���� �̸� ������
		String uriString = request.getRequestURI().toString();
		//url���� �����ּ� ������ ��
		out.print("<html><body bgcolor='yellow'>");
		out.print("<p>URLTestServlet02</p>");
		out.print("<p> ���ؽ�Ʈ �̸�: " + context + "</p>");
		out.print("<p> ��ü ��� (URL): " + urlString + "</p>");
		out.print("<p> �����̸�: " + mappingString + "</p>");
		out.print("<p> URI: " + uriString + "</p>");
		out.print("</body></html>");
	}

}