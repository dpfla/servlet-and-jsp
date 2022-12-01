package servletForward.ex04;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/setContext")
public class SetSVContext extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter outPrintWriter=response.getWriter();
		ServletContext context=getServletContext();
		//context�� �����ϱ� ���� �����´�.
		List member=new ArrayList();
		member.add("ȫ�浿");
		member.add(50);
		context.setAttribute("member", member);
		
		outPrintWriter.print("<html><body>");
		outPrintWriter.print("�̸��� ���̸� ������");
		outPrintWriter.print("</body></html>");
	}

}
