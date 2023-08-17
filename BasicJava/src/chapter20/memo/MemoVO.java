package chapter20.memo;

import java.sql.Timestamp; 

// VO : Value Object 값을 저장하는 객체
// DTO : Data Transfer Object 저장된 값을 전달하는 객체
// Bean : 자바가 커피원두에서 따온 이름이라 객체를 Bean으로 표현하기도 함
// Model : 데이터와 관련된 객체를 Model이라고 부르기도 함. 데이터를 저장하는 형태.
// Item : 각각의 데이터를 표현하는 의미로 아이템이라고 부르기도 함
// javaBeans 패턴 vs Builder 패턴
// 최근에는 객체 선언 도구 => Lombok 사용 => boilerplate code를 없애는 역할 
// 필드 선언 후 class앞에 @Data 선언해주면 생성자, 게터, 세터 자동 생성. 다만, Lombok 플러그 필요
public class MemoVO {
	private int no;
	private String title;
	private String content;
	private String writer;
	private Timestamp registerDate; // 시간까지 출력. 자바sql것
	private Timestamp modifyDate;
	// insert 할 때 사용
	public MemoVO(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	// update 할 때 사용
	public MemoVO(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	// select 할 때 사용
	public MemoVO(int no, String title, String content, String writer, Timestamp registerDate, Timestamp modifyDate) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Timestamp getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}
	public Timestamp getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%s\t%s\n", no, title, content, writer, registerDate, modifyDate );
	}
	
}
