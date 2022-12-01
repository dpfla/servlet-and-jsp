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

@WebServlet("/getContext")
public class GetSVContext extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter outPrintWriter=response.getWriter();
		ServletContext context=getServletContext();
		List member=(ArrayList)context.getAttribute("member");
		String name=(String)member.get(0);
		int age=(Integer)member.get(1);
		
		outPrintWriter.print("<html><body>");
		outPrintWriter.print("�̸�: " + name + " / ����: " + age);
		outPrintWriter.print("</body></html>");
	}

}
