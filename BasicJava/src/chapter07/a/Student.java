package chapter07.a;

public class Student extends People {
	public int studentNo;
// 밑에 생성자 없으면 오류 
// 수정방법 2가지
// 1. 부모 클래스에 기본 생성자 만들어주기 public people(){}
// 2. 자식 클래스에서 생성된 부모의 기본 생성자 super(){} 를 부모 클래스에 생성된 생성자 형식으로 맞춰주기
// super(){} --> super("",""){}
// 부모 클래스 수정하기 어려운경우 많아서 보통은 2번 경우 이용. 
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자 호출
		this.studentNo = studentNo;
	}
}
