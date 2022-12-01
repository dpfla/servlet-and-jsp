package servletForward.ex05;

import jakarta.servlet.http.HttpServlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/contextfile")
public class ContextFileServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter outPrintWriter=response.getWriter();
		ServletContext context=getServletContext();
		InputStream inputs=context.getResourceAsStream("/WEB-INF/bin/init.txt");
		BufferedReader bfReader=new BufferedReader(new InputStreamReader(inputs));
		String menu=null, menu_member=null, menu_order=null, menu_goods=null;
		while ((menu=bfReader.readLine()) != null) {
			StringTokenizer tokenizer=new StringTokenizer(menu, ",");
			menu_member=tokenizer.nextToken();
			menu_order=tokenizer.nextToken();
			menu_goods=tokenizer.nextToken();
		}
		
		outPrintWriter.print("<html><body>");
		outPrintWriter.print("<p>" + menu_member + "</p>");
		outPrintWriter.print("<p>" + menu_order + "</p>");
		outPrintWriter.print("<p>" + menu_goods + "</p>");
		outPrintWriter.print("</body></html>");
		
	}

}
