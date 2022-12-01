package servletLink.ex04;

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
			System.out.println("����Ŭ ���� ����");
		}
	}
	
	//ȸ����� Ȯ��
	public List<MemberVO> listMembers() {
		List<MemberVO> list=new ArrayList<MemberVO>();
		
		try {
			con=dataFactory.getConnection();
			String queryString="select * from membertbl";
			System.out.println("��ɹ� ������: " + queryString);
			pstmt=con.prepareStatement(queryString);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String idString=rs.getString("id");
				String pwdString=rs.getString("pwd");
				String nameString=rs.getString("name");
				String emailString=rs.getString("email");
				Date joinDate=rs.getDate("joinDate");
				
				MemberVO vo=new MemberVO();
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
			System.out.println("����Ŭ ���� ������: "+ e.getMessage());
		}
		
		return list;
	}
	
	//ȸ�����
	public void addMember(MemberVO vo){
		try {
			con=dataFactory.getConnection();
			String idString=vo.getId();
			String pwdString=vo.getPwd();
			String nameString=vo.getName();
			String emailString=vo.getEmail();
			
			String queryString="insert into membertbl(id, pwd, name, email) values(?,?,?,?)";
			pstmt=con.prepareStatement(queryString);
			pstmt.setString(1, idString);
			pstmt.setString(2, pwdString);
			pstmt.setString(3, nameString);
			pstmt.setString(4, emailString);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println("����� ���� �߻�: " + e.getMessage());
		}
	}

	//ȸ�� ����
	public void delMember(String id) {
		try {
			con=dataFactory.getConnection();
			String query="delete from membertbl where id=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println("������ ���� �߻�: " + e.getMessage());
		}
	}
	
	//ȸ������ Ȯ��
	public boolean isExisted(MemberVO memberVO) {
		boolean result=false;
		String id=memberVO.getId();
		String pwd=memberVO.getPwd();
		
		try {
			con=dataFactory.getConnection();
			String query="select decode(count(*), 1, 'true', 'false') as result from membertbl where id=? and pwd=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			result=Boolean.parseBoolean(rs.getString("result"));
		} catch (Exception e) {
			System.out.println("ȸ�� ���� ��ȸ ����: "+ result + " / " + id + " / " + pwd);
			System.out.println(e.getMessage());
		}
		return result;
		
	}
}
