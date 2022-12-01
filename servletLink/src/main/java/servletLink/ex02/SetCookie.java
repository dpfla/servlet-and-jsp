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
		Cookie cookie=new Cookie("cookieTest", URLEncoder.encode("���� ����� 23��", "utf-8"));
		//�ѱ��� ������ �������� -> URLEncoder.encode() ���
		cookie.setMaxAge(24*60*60); // �� ������ ���� ����
		response.addCookie(cookie);
		out.print("��Ű ������ �ð�: " + date);
		out.print("<br>��Ű�� ����Ǿ����ϴ�.");
	}

}
