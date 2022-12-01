package servlet02.ex01;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	private static float USD_RATE=1394.40F;
	private static float JPY_RATE=965.07F;
	private static float CNY_RATE=199.79F;
	private static float GBP_RATE=1603.78F;
	private static float EUR_RATE=1390.99F;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw=response.getWriter();
		String command=request.getParameter("command");
		String won=request.getParameter("won");
		String operator=request.getParameter("operator");
		
		if(command != null && command.equals("calculate")) {
			String result=calculate(Float.parseFloat(won), operator);
			pw.print("<html><font size=10>��ȯ ��� </font><br>");
			pw.print("<font size=10>" + result + "</font><br>");
			pw.print("<a href='/servlet02/calc'>ȯ�� ����</a></html>");
			return;
		}
		pw.print("<html><title>ȯ������</title>");
		pw.print("<body><font size=5>ȯ������</font><br>");
		pw.print("<form name='frmCalc' method='get' action='/servlet02/calc'>");
		pw.print("��ȭ: <input type='text' name='won' size=10>");
		pw.print("<select name='operator'>");
		pw.print("<option value='dollar'>�޷�</option>");
		pw.print("<option value='en'>��ȭ</option>");
		pw.print("<option value='wian'>����</option>");
		pw.print("<option value='pound'>�Ŀ��</option>");
		pw.print("<option value='euro'>����</option></select>");
		pw.print("<input type='hidden' name='command' value='calculate'>");
		pw.print("<input type='submit' value='��ȯ'>");
		pw.print("</form></body></html>");
		pw.close();
		
	}
	
	//ȯ�� ����� ������� �����ϴ� �޼���
	private static String calculate(float won, String operator) {
		String result=null;
		if(operator.equals("dollar")) {
			result=String.format("%.6f", won/USD_RATE);
		} else if(operator.equals("en")) {
			result=String.format("%.6f", won/JPY_RATE);
		} else if(operator.equals("wian")) {
			result=String.format("%.6f", won/CNY_RATE);
		} else if(operator.equals("pound")) {
			result=String.format("%.6f", won/GBP_RATE);
		} else if(operator.equals("euro")) {
			result=String.format("%.6f", won/EUR_RATE);
		}
		return result;
	}
}
