package chapter06.e;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";            
		//p1.ssn = "654321-7654321" ;
		//필드 정의를 final로 해서 새로운 값 입력x --> 컴파일 에러.
		p1.name = "홍삼원";
		System.out.println(p1.name);
	}

}
