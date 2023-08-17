package chapter07.a;

public class Child extends Parent {
	private String name;

	public Child() {
		// super(); this();로인해 super 중복되어 실행x
		this("홍길동");
		System.out.println("Child ( ) call");
	}

	public Child(String name) {
		super(); //부모의 객체를 먼저 생성해야 하므로 반드시 위에!! 
		//자식 생성자에는 부모 생성자 호출인 super();가 생략되어 있음.
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
// 어떤게 생략되어 있는지 파악하기
// 모든 생성자에는 super(); 생략이 되어 있음
// this();로 인해 public Child(String name) 으로 이동하니깐 super();가 있으면 안됨.
 
