package servletLink.ex01;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/loginUrl")
public class LoginURLServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String user_id= request.getParameter("user_id");
		String user_pw= request.getParameter("user_pw");
		String user_hp= request.getParameter("user_hp");
		String user_email= request.getParameter("user_email");
		String user_address= request.getParameter("user_address");
		
		String data="<html><body><p>�α����Ͽ����ϴ�.</p>";
		data+="<p>���̵�: " + user_id + "</p>";
		data+="<p>��й�ȣ: " + user_pw + "</p>";
		data+="<p>��ȭ��ȣ: " + user_hp + "</p>";
		data+="<p>�̸���: " + user_email + "</p>";
		data+="<p>�ּ�: " + user_address + "</p>";
		data+="<a href='/servletLink/sports?user_id="+user_id+"'>������ �߰躸��</a>";
		data+="</body></html>";
		out.print(data);
	}

}
