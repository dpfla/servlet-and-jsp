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

@WebServlet("/sessiontest1")
public class SessionTest1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		HttpSession session = request.getSession();
		//session�� ������ ����, ������ ������ �ҷ���
		out.print("���� ���̵�: " + session.getId() + "<br>");
		//id: String Ÿ��
		out.print("���� ���� ���� �ð�: " + new Date(session.getCreationTime()) + "<br>");
		out.print("���� ���� ���� �ð�: " + session.getCreationTime() + "<br>");
		out.print("�ֱ� ���� ���� �ð�: " + new Date(session.getLastAccessedTime()) + "<br>");
		out.print("�ֱ� ���� ���� �ð�: " + session.getLastAccessedTime() + "<br>");
		out.print("���� ��ȿ �ð�: " + session.getMaxInactiveInterval() + "<br>");
		//�⺻: 30��, �ʴ���
		//���ǵ� ��Ű�� ���������.
		if(session.isNew()) {
			out.print("�� ������ ����������ϴ�.");
		}
	}

}
