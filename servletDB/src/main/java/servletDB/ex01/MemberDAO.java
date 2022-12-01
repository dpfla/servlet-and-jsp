package servletDB.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class MemberDAO {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url="jdbc:oracle:thin:@DESKTOP-33MD03D:1521:XE"; 
	//DB 연결할 호스트(jdbc:oracle:thin:@localhost:1521:XE), sql디벨로퍼와 같은 호스트 설정으로 적어줘야함 
	private static final String user="myhomedb";
	//연결할 DB 계정 이름
	private static final String pwd="1234";
	//연결할 DB 계정 비밀번호
	private Connection con;
	private Statement stmt;
	//DB를 연결하고 쿼리문을 조회할 때마다 DBMS를 컴파일하여 속도 느림
	//=> PreparedStatement 사용(: sql문을 미리 컴파일하여 재사용) 
	
	public List<MemberVO> listMembers(){
		List<MemberVO> list=new ArrayList<MemberVO>();
		try {
			connDB();
			String query="select * from membertbl";
			ResultSet rs=stmt.executeQuery(query);
			//ResultSet: 쿼리의 결과를 행단위로 하나씩 가져올 수 있게함
			// 맨 처음은 자료가 아닌 시작점을 가짐
			while(rs.next()) {
				String id=rs.getString("id"); //컬럼 이름 or 인덱스 번호(0~)
				String pwd=rs.getString("pwd");
				String name=rs.getString("name");
				String email=rs.getString("email");
				Date joinDate=rs.getDate("joinDate");
				
				MemberVO vo=new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			stmt.close();
			con.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			stmt=con.createStatement();
			System.out.println("Statement 생성 성공");
		} catch (Exception e) {
			System.out.println("연결오류: " + e.getMessage());
		}
	}
}
