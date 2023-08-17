package chapter06.f.package1;

public class B {
	A a; //같은 패키지 안이라 A 클래스 접근 가능. 
	A a1 = new A(true);   
	A a2 = new A(1);      
	//A a3 = new A("문자열"); private 생성자 접근 불가
	
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; private 필드 접근 불가 그래서 자동생성에도 안뜸
		
		a.method1();
		a.method2();
		//a.method3(); private 메소드 접근 불가 그래서 자동생성에도 안뜸
		
	}
	
	
}
