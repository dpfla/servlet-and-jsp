package jspFile.ex02;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/upload.do")
public class FileUpload extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String encodString = "utf-8";
		File currentFolder=new File("C:\\myJSP\\file_up");
		DiskFileItemFactory factory=new DiskFileItemFactory();
		factory.setRepository(currentFolder);
		//저장할 폴더 설정
		factory.setSizeThreshold(1024*1024);
		//최대 파일 크기 설정
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		try {
			List<FileItem> itemsList=upload.parseRequest(request);
		} catch (Exception e) {
			System.out.println("파일 버로드 실패: " + e.getMessage());
		}
	}
}
