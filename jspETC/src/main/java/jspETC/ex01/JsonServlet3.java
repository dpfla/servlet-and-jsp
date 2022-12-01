package jspETC.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/json3")
public class JsonServlet3 extends HttpServlet {

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
		
		JSONObject totalObject = new JSONObject();
		JSONArray memArray = new JSONArray();
		//JSONObject를 배열 형태로 사용하기 위해 선언
		JSONObject memberInfo = new JSONObject();
		memberInfo.put("name", "홍길동");
		memberInfo.put("age", 50);
		memberInfo.put("job", "도적");
		memArray.add(memberInfo);
		
		memberInfo = new JSONObject();
		memberInfo.put("name", "이영희");
		memberInfo.put("age", 25);
		memberInfo.put("job", "영업사원");
		memArray.add(memberInfo);
		
		memberInfo = new JSONObject();
		memberInfo.put("name", "김철수");
		memberInfo.put("age", 32);
		memberInfo.put("job", "사무원");
		memArray.add(memberInfo);
		
		totalObject.put("member", memArray);
		//
		JSONArray bookArray = new JSONArray();
		JSONObject bookInfo = new JSONObject();
		bookInfo.put("title", "Node.js 프로그래밍");
		bookInfo.put("writer", "한빛미디어 / 윤인성");
		bookInfo.put("image", "http://localhost:8090/jspETC/images/node.jpg");
		bookArray.add(bookInfo);
		
		bookInfo = new JSONObject();
		bookInfo.put("title", "실시간 사용자 경험 프로그래밍");
		bookInfo.put("writer", "한빛미디어 / 테드 로덴");
		bookInfo.put("image", "http://localhost:8090/jspETC/images/ux.gif");
		bookArray.add(bookInfo);
		
		totalObject.put("books", bookArray);
		
		String jsonInfo=totalObject.toJSONString();
		out.print(jsonInfo);
	}	
}
