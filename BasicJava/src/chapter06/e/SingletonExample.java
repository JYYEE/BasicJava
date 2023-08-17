package chapter06.e;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		// singleton1 과 singleton2는 같은 객체
		System.out.println(singleton1 == singleton2);
		
		singleton1.setName("홍길동");
		System.out.println(singleton2.getName());
		
	}

}
