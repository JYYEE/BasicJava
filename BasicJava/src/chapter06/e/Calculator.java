package chapter06.e;

public class Calculator {
	int value; //static 무
	
	static double pi = 3.14159; //static 유
	
	static int plus(int x, int y) { //static 유
		return x + y;
	}
	
	void run() { //static 무
		System.out.println("계산기 실행 완료");
	}
	public static void main(String[] args) {
		
	}

}
