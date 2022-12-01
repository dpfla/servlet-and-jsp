package jspETC.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/json")
public class JsonServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String jsonInfo=request.getParameter("jsonInfo");
		JSONParser jsonParser = new JSONParser();
		//json �����͸� ó���ϱ� ���� JSONParser() ����
		try {
			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonInfo);
			//���۵� ������ parse, �߸��� �������� �� �ֱ⿡ �ǹ������� try catch �䱸
			System.out.println("ȸ������");
			System.out.println(jsonObject.get("name"));
			System.out.println(jsonObject.get("age"));
			System.out.println(jsonObject.get("job"));
		} catch (ParseException e) {
			System.out.println("���� ");
			e.printStackTrace();
		}
		
		out.print("������ ���� �Ϸ�");
		
		
	}	
}
