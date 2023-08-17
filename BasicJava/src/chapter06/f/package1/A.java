package chapter06.f.package1;

public class A { //public 지우면 B 접근 가능, C 접근 불가 --> public 붙임
	A a1 = new A(true);   // A 내부에서는 접근 가능
	A a2 = new A(1);      // A 내부에서는 접근 가능
	A a3 = new A("문자열");// A 내부에서는 접근 가능
	
	public A(boolean b) {} //
	A(int b){}             // default
	private A(String s) {} // private
	
	public int field1;
	int field2;
	private int field3; //private는 이 클래스에서만 사용가능하므로 여기서 사용하지 않았으면 사용되지 않았다는 경고뜸.
	// public과 default는 다른 곳에서 사용될 가능성이 있으므로 사용되지 않았다고 경고 뜨지 않음.
	
	public A() {
		field1 =1 ;
		field2 =1 ;
		field3 =1 ;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}

}
