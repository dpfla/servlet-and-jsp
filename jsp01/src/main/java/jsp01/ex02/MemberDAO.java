package jsp01.ex02;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	private Connection connection;
	private PreparedStatement pstmt;
	private DataSource dataFactory;
	
	public MemberDAO() {
		try {
			Context ctx=new InitialContext();
			Context envContext=(Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public List listMembers(MemberVO memberVO) {
		List memberList=new ArrayList();
		String _name=memberVO.getName();
		try {
			connection = dataFactory.getConnection();
			String query = "select * from membertbl";
			if(_name != null && _name.length() != 0) {
				query+=" where name=?";
				pstmt = connection.prepareStatement(query);
				pstmt.setString(1, _name);
			}else {
				pstmt = connection.prepareStatement(query);
			}
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				String id=rs.getString("id");
				String pw=rs.getString("pwd");
				String name=rs.getString("name");
				String email=rs.getString("email");
				Date joinDate=rs.getDate("joinDate");
				
				MemberVO vo=new MemberVO();
				vo.setId(id);
				vo.setPwd(pw);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				
				memberList.add(vo);
			}
			rs.close();
			pstmt.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("DB 조회 에러 : " + e.getMessage());
		}
		
		return memberList;
	}
}
