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
		
		String data="<html><body><p>로그인하였습니다.</p>";
		data+="<p>아이디: " + user_id + "</p>";
		data+="<p>비밀번호: " + user_pw + "</p>";
		data+="<p>전화번호: " + user_hp + "</p>";
		data+="<p>이메일: " + user_email + "</p>";
		data+="<p>주소: " + user_address + "</p>";
		data+="<a href='/servletLink/sports?user_id="+user_id+"'>스포츠 중계보기</a>";
		data+="</body></html>";
		out.print(data);
	}

}
