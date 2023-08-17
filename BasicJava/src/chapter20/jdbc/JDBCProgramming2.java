package chapter20.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// try-catch 이용
public class JDBCProgramming2 {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//()안이 길면 마우스 () 안에 두고 ctrl +1 누르고 extract local variable 선택 -> 변수로 추출
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "YJY";
			String password = "java";
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
//			String sql = "";
//			sql += " SELECT";
//			sql += "     mem_id,";
//			sql += "     mem_name,";
//			sql += "     mem_bir,";
//			sql += "     mem_add1,";
//			sql += "     mem_add2,";
//			sql += "     mem_job"; // 글자 다음 FROM 바로 와서 FROM절 못찾을 수도 있음 -> 첫칸을 띄움(에러방지) 또는 뒷따옴표 앞에 공란 만듦.
//			sql += " FROM";
//			sql += "     member";
			// 문자열 결합보다는 StringBuilder 또는 StringBuffer를 사용하는게 좋다. 
			// 스레드에 안전한 타입 : StringBuffer(데이터 보존에 좋지만 속도는 느림)
			StringBuilder builder = new StringBuilder();
			builder.append("SELECT ");
			builder.append("    mem_id, ");
			builder.append("    mem_name, ");
			builder.append("    mem_bir, ");
			builder.append("    mem_add1, ");
			builder.append("    mem_add2, ");
			builder.append("    mem_job ");
			builder.append("FROM ");
			builder.append("    member ");
			String sql = builder.toString();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				String memId = resultSet.getString("mem_id");
				String memName = resultSet.getString("mem_name");
				Date memBir = resultSet.getDate("mem_bir");
				String memAdd1 = resultSet.getString("mem_add1");
				String memAdd2 = resultSet.getString("mem_add2");
				String memJob = resultSet.getString("mem_job");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", memId, memName,
						memBir, memAdd1, memAdd2, memJob);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();					
				}
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
		
		
	}

}
