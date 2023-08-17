package chapter20.memo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

// DAO : Data Access Object 데이터베이스에 접근해서 데이터 처리 담당
public class MemoDAO {
	/*
	 * junit이라는 단위 테스트 라이브러리--> 같은 패키지에 넣으면 배포시 문제가 될 수 있어 폴더를 따로 구분해서 사용.
	 * 
	 */
	
	// 전체 목록 조회, 상세 메모 조회, 메모 등록, 수정, 삭제
	// 전체 목록 조회
	public List<MemoVO> selectMemos(String searchWord) throws Exception{ 
		// try-catch문 사용해야하지만 지금은 코드 흐름 보기 위해 throws이용
		// DriverManager에 DB 드라이버를 등록하는 메소드를 사용할 수 도 있음.
		Class.forName("oracle.jdbc.driver.OracleDriver"); // () 안 오타 주의 --> new OracleDriver 생성해서 복붙
//		DriverManager.registerDriver(new OracleDriver()); // 또는 객체 생성 --> 힙에 쌓이니깐 잘 사용은 안함
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "YJY";
		String password = "java";
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
		// "" 사이 뒤쪽으로 공백 줘야 FROM절 분리 가능 
		builder.append("SELECT ");
		builder.append("    a.no, ");
		builder.append("    a.title, ");
		builder.append("    a.content, ");
		builder.append("    b.mem_name writer, ");
		builder.append("    a.register_date, ");
		builder.append("    a.modify_date ");
		builder.append("FROM ");
		builder.append("    memo a ");
		builder.append("    INNER JOIN member b ON a.writer = b.mem_id ");
		String sql = builder.toString();		
		ResultSet resultSet = statement.executeQuery(sql);
		List<MemoVO> list = new ArrayList<>();
		while(resultSet.next()) {
			int no = resultSet.getInt("no"); // 변수와 () 안 컬럼명 같게 하는게 좋음.
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			String writer = resultSet.getString("writer");
			Timestamp registerDate = resultSet.getTimestamp("register_date");
			Timestamp modifyDate = resultSet.getTimestamp("modify_date");
			list.add(new MemoVO(no, title, content, writer, registerDate, modifyDate));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
	// 상세 메모 조회
	public MemoVO selectMemo(int searchNo) {
		return null;
	}
	// 메모 등록
	public int insertMemo(MemoVO vo) throws Exception {
		//void 타입도 괜찮음. int 타입은 return 데이터 보고 데이터 삽입 몇 번 되었는지 알 수 있음.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "YJY";
		String password = "java";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO memo ( ");
		builder.append("    no, ");
		builder.append("    title, ");
		builder.append("    content, ");
		builder.append("    writer ");
		builder.append(") VALUES ( ");
		builder.append("    seq_memo.NEXTVAL, ");		
		//그냥 작은 따옴표 안에 넣으면 문자열로 인식 
		//--> ''사이 "" 넣고 그 사이 문자열 결합위해 ++ 넣어서 ++사이에 메소드 넣기
//		builder.append("    '"+ vo.getTitle() +"', ");// MemoVO에 있는 데이터 호출. 
//		builder.append("    '"+ vo.getContent() +"', ");
//		builder.append("    '"+ vo.getWriter() +"' "); 
		// 불러와야할 데이터가 많으면 번거로움 --> 데이터 대신 ? 쓰고 toString 포맷팅하듯이 포맷팅함. --> prepareStatement 이용
		builder.append("    ?, "); 
		builder.append("    ?, ");
		builder.append("    ? ");
		builder.append(") ");
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql); 
		statement.setString(1, vo.getTitle()); // setString이면 자동으로 작은 따옴표('') 가 붙는다.
		statement.setString(2, vo.getContent());// setInt면 작은 따옴표가 붙지 않는다.
		statement.setString(3, vo.getWriter());
		int count = statement.executeUpdate();
		
		statement.close();
		connection.close();
				
		return count;
	}
	// 메모 수정
	public int updateMemo(MemoVO vo) {
		return 0;
	}
	public int deleteMemo(int deleteNo) {
		return 0;
	}
}
