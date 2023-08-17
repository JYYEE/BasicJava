package chapter20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBCProgramming {
	public static void main(String[] args) throws Exception {
	//	
	//	JDBC (Java DataBase Connectivity)
	//	자바와 데이터베이스 연동
	//	자바언어를 이용하여 데이터베이스 데이터 읽어옴
	//	Database vendor
	//	0. 준비물 : DBMS 전용 드라이버 (oracle driver 다운) 이름 : ojdbc.jar
	//	ojdbc8은 jdk 1.8에서 컴파일. ojdbc11은 jdk 11에서 컴파일
	//	컴파일이 높고 버전이 낮으면 실행 안됨 (현 jdk 1.8이므로 ojdbc 11은 실행 안됨) 
	//	컴파일이 낮고 버전이 높으면 실행 가능 --> 컴파일 버전이 중요.
	//	다운 방법
	//	1-1. ojdbc 검색후 설치된 jdk보다 낮은 버전의 ojdbc 설치(ojdbc8 설치)
	//	1-2. sqldeveloper 설치 프로그램 파일 -> jdbc폴더에 설치파일 존재
	//	2. 이클립스 실행후 열고자 하는 목록(BasicJava) 오른쪽버튼 Build Path -> Configure Build Path -> Libraries탭에서 Add External JARs 선택후 다운받은 설치파일 선택
	//	new OracleDriver(); 해서 에러 안뜨면 잘 연결된 것
	//	연결 방법
	//	1. 드라이버 로딩(Reflection 기법 사용) (프로그램 on)
		new OracleDriver(); // 드라이버 경로를 알기 위함.
		Class.forName("oracle.jdbc.driver.OracleDriver");
	//	2. 접속 정보를 이용하여 DBMS에 접속(Connection)
		 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "YJY", "java"); 
	//	url, id, pw 필요
	//	localhost(127.0.0.1)대신에 ip주소(192.168.146.77)를 넣어주면 공유 db로 만들 수 있음  
	//	3. 쿼리를 전송할 객체(진술문Statement) 생성 (오라클에서 워크시트 만드는 것과 같은 역할)
		Statement statement = connection.createStatement();
	//	4. 쿼리를 실행 또는 전송
		String sql = "select mem_id, mem_name, mem_hp, mem_mail from member";
	//	db에서 테이블 작성할 때 쓰는 세미콜론 --> 자바로 옮겨올 때 빼주기
	//  반드시 sql에서 먼저 실행해보고 잘 동작하면 자바로 넣어주기 	
	//	5. select : executeQuery 메소드(eQ + ctrl + space) => 쿼리문 결과를 객체(ResultSet)로 전달 받음 
	//	   insert, update, delete : executeUpdate (eU + ctrl + space) => 실행 완료된 row 카운트 결과 전송
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()) {
			//	커서 다음행에 데이터 있으면 실행
			//	커서는 아래쪽으로만 움직일 수 있음. 
			String memId = resultSet.getString("mem_id"); // ()안에 인덱스 번호 쓰는데 주로 컬럼명 씀
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			System.out.printf("%s\t%s\t%s\t%s\n", memId, memName, memHp, memMail);
		}
	//	6. 자원(Resource: Connection, Statement, ResultSet) 반납 (close로 닫아주기 또는 프로그램 off)
		resultSet.close();
		statement.close();
		connection.close();
	//	JDBC pool --> 연속적으로 쿼리 전송 가능하게 해줌.
	//	흐름을 외워두기!!!!!!!
	}

}
