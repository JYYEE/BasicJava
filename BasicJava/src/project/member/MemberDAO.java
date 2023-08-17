package project.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberDAO {
	// 로그인 - 전체 회원 조회 select
	public MemberVO loginMember(MemberVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.146.54:1521:xe", "basic_project", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ");
		builder.append("    mem_id, ");
		builder.append("    mem_name, ");
		builder.append("    mem_add, ");
		builder.append("    mem_hp, ");
		builder.append("    mem_mileage ");
		builder.append("FROM ");
		builder.append("    member ");
		builder.append("WHERE ");
		builder.append("    mem_id = ? ");
		builder.append("    AND   mem_pw = func_md5_pw(?) ");
		
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getId());
		statement.setString(2, vo.getPassword());
		ResultSet resultSet = statement.executeQuery();
		MemberVO member = null;
		if (resultSet.next()) {
			String id = resultSet.getString("mem_id");
			String name = resultSet.getString("mem_name");
			String add = resultSet.getString("mem_add");
			String hp = resultSet.getString("mem_hp");
			int mileage = resultSet.getInt("mem_mileage");
			member = new MemberVO(id, name, add, hp, mileage);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return member;
	}
	
	// 회원가입 insert
	public int joinMember(MemberVO vo) {
		Connection connection = null;
		PreparedStatement statement = null;
		int joinCount=0 ;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.146.54:1521:xe", "basic_project", "java");
			StringBuilder builder = new StringBuilder();
			builder.append("INSERT INTO member ( ");
			builder.append("    mem_id, ");
			builder.append("    mem_pw, ");
			builder.append("    mem_name, ");
			builder.append("    mem_add, ");
			builder.append("    mem_hp ");
			builder.append(") VALUES ( ");
			builder.append("    ?, ");
			builder.append("    func_md5_pw(?), ");
			builder.append("    ?, ");
			builder.append("    ?, ");
			builder.append("    ? ");
			builder.append(") ");
			
			String sql = builder.toString();
			statement = connection.prepareStatement(sql);
			statement.setString(1, vo.getId());
			statement.setString(2, vo.getPassword());
			statement.setString(3, vo.getName());
			statement.setString(4, vo.getAdd());
			statement.setString(5, vo.getHp());
			joinCount = statement.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) {
					statement.close();					
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return joinCount;
	}
	
	// id 중복 조회 select
	public MemberVO duplicateIdCheck(MemberVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.146.54:1521:xe", "basic_project", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("SELECT ");
		builder.append("    mem_id ");
		builder.append("FROM ");
		builder.append("    member ");
		builder.append("WHERE ");
		builder.append("    mem_id = ? ");
	
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getId());
		ResultSet resultSet = statement.executeQuery();
		MemberVO member = null;
		if (resultSet.next()) {// 같은 아이디가 존재하면 행 존재
			String id = resultSet.getString("mem_id");
			member = new MemberVO(id);
		}
		return member;
	}// null이어야지 id중복x
		
	// 내정보 수정 update
	public int updateMember(MemberVO vo) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.146.54:1521:xe", "basic_project", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("UPDATE member ");
		builder.append("    SET ");		
		builder.append("        mem_name = ?, ");
		builder.append("        mem_add = ?, ");
		builder.append("        mem_hp = ? ");
		builder.append("WHERE ");
		builder.append("    mem_id = ? ");
		
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getName());
		statement.setString(2, vo.getAdd());
		statement.setString(3, vo.getHp());
		statement.setString(4, vo.getId());
		int updateCount = statement.executeUpdate();
		return updateCount;
	}
	
	// 비밀번호 수정 update
		public int updatePassword(List<String> list) throws Exception {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.146.54:1521:xe", "basic_project", "java");
			StringBuilder builder = new StringBuilder();
			builder.append("UPDATE member ");
			builder.append("    SET ");
			builder.append("        mem_pw = func_md5_pw(?) ");
			builder.append("WHERE ");
			builder.append("    mem_id = ? ");
			builder.append("    AND   mem_pw = func_md5_pw(?) ");
			
			String sql = builder.toString();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, list.get(1));
			statement.setString(2, MemberApplication.getSession().getId());
			statement.setString(3, list.get(0));
			int updatePasswordCount = statement.executeUpdate();
			return updatePasswordCount;
			}
}
