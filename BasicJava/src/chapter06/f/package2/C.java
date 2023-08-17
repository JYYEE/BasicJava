package chapter06.f.package2;

import chapter06.f.package1.A;
import chapter06.f.package1.B;

public class C {
	// 클래스 접근 불가. A a;
	B b; //임포트문 생성되며 접근 가능.
	
	
	A a1 = new A(true);  // 임포트문 생성되며 접근 가능       
	//A a2 = new A(1);      default생성자 접근 불가
	//A a3 = new A("문자열");  private 생성자 접근 불가
	
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;  default 필드 접근 불가 그래서 자동생성 안뜸
		//a.field3 = 1;  private 필드 접근 불가 그래서 자동생성 안뜸
		
		a.method1();
		//a.method2();   default 메소드 접근 불가 그래서 자동생성 안뜸
		//a.method3();   private 메소드 접근 불가 그래서 자동생성 안뜸
		
	}
	
	
}
