package chapter06.b;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	// Design pattern : telescoping constructor pattern
	
	Korean(String name, String ssn){
		this.name = name;
		//좌변의 name은 String 의 name이었는데 인식 못함.
		//구분을 하기위해 나온게 this
		this.ssn = ssn;
	}

}
