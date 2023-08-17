package chapter06.d;

public class Printer {
	//출력하는 메소드. 이름이 같으면 동작 유추 가능. 동작은 같은데 매개값만 다를 때 장점.
	void println(int intval) {
		System.out.println(intval);
	}

	void println(boolean bl) {
		System.out.println(bl);
	}

	void println(double douval) {
		System.out.println(douval);
	}

	void println(String str1) {
		System.out.println(str1);
	}
}
