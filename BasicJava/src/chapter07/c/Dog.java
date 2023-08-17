package chapter07.c;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() { // 추상 메소드 재정의
		System.out.println("멍멍");

	}
}
