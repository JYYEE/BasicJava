package chapter04;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f ; x<=1.0f ; x+=0.1f) {
			System.out.println(x);
			// x는 카운팅 변수. float타입은 0.6까지는 규칙대로 더해지지만 그 이후 근사치에 가까운 값을 도출해냄
			//실수는 정확하게 표현할 수 없음
		}
	}

}
