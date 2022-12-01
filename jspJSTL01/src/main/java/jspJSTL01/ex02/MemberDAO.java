package jspJSTL01.ex02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			Context ctx=new InitialContext();
			Context envContext=(Context)ctx.lookup("java:/comp/env");
			dataFactory=(DataSource)envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			System.out.println("오라클 연결 실패");
		}
	}
	
	//회원목록 확인
	public List listMembers() {
		List list=new ArrayList();
		
		try {
			con=dataFactory.getConnection();
			String queryString="select * from membertbl";
			System.out.println("명령문 수행결과: " + queryString);
			pstmt=con.prepareStatement(queryString);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String idString=rs.getString("id");
				String pwdString=rs.getString("pwd");
				String nameString=rs.getString("name");
				String emailString=rs.getString("email");
				Date joinDate=rs.getDate("joinDate");
				
				MemberBean vo=new MemberBean();
				vo.setId(idString);
				vo.setPwd(pwdString);
				vo.setName(nameString);
				vo.setEmail(emailString);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("오라클 연결 끊어짐: "+ e.getMessage());
		}
		
		return list;
	}
	
	//회원등록
	public void addMember(MemberBean memberBean){
		try {
			con=dataFactory.getConnection();
			String idString=memberBean.getId();
			String pwdString=memberBean.getPwd();
			String nameString=memberBean.getName();
			String emailString=memberBean.getEmail();
			
			String queryString="insert into membertbl(id, pwd, name, email) values(?,?,?,?)";
			pstmt=con.prepareStatement(queryString);
			pstmt.setString(1, idString);
			pstmt.setString(2, pwdString);
			pstmt.setString(3, nameString);
			pstmt.setString(4, emailString);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println("등록중 오류 발생: " + e.getMessage());
		}
	}

	//회원 삭제
	public void delMember(String id) {
		try {
			con=dataFactory.getConnection();
			String query="delete from membertbl where id=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println("삭제중 오류 발생: " + e.getMessage());
		}
	}
}
