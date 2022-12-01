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
	//DB ������ ȣ��Ʈ(jdbc:oracle:thin:@localhost:1521:XE), sql�𺧷��ۿ� ���� ȣ��Ʈ �������� ��������� 
	private static final String user="myhomedb";
	//������ DB ���� �̸�
	private static final String pwd="1234";
	//������ DB ���� ��й�ȣ
	private Connection con;
	private Statement stmt;
	//DB�� �����ϰ� �������� ��ȸ�� ������ DBMS�� �������Ͽ� �ӵ� ����
	//=> PreparedStatement ���(: sql���� �̸� �������Ͽ� ����) 
	
	public List<MemberVO> listMembers(){
		List<MemberVO> list=new ArrayList<MemberVO>();
		try {
			connDB();
			String query="select * from membertbl";
			ResultSet rs=stmt.executeQuery(query);
			//ResultSet: ������ ����� ������� �ϳ��� ������ �� �ְ���
			// �� ó���� �ڷᰡ �ƴ� �������� ����
			while(rs.next()) {
				String id=rs.getString("id"); //�÷� �̸� or �ε��� ��ȣ(0~)
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
			System.out.println("Oracle ����̹� �ε� ����");
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection ���� ����");
			stmt=con.createStatement();
			System.out.println("Statement ���� ����");
		} catch (Exception e) {
			System.out.println("�������: " + e.getMessage());
		}
	}
}
