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
		//html ajax���� ������ XML�� �����س��� ������ out.print�� ������ ������ XML�� �ν��Ѵ�
		out.print("<main>");
		
		out.print("<book>");
		out.print("<title>Node.js ���α׷���</title>");
		out.print("<writer>�Ѻ��̵�� / ���μ�</writer>");
		out.print("<image>http://localhost:8090/jspETC/images/node.jpg</image>");
		out.print("</book>");
		
		out.print("<book>");
		out.print("<title>�ǽð� ����� ���� ���α׷���</title>");
		out.print("<writer>�Ѻ��̵�� / �׵� �ε�</writer>");
		out.print("<image>http://localhost:8090/jspETC/images/ux.gif</image>");
		out.print("</book>");
		
		out.print("</main>");
	}

}
