package chapter06.e;

import chapter06.a.Car;

// 다른 패키지에 있는 클래스 가져다 쓸 때 알려주는 임포트문

public class Earth {
	//Naming Convention(명명규칙)
	//상수는 모두 대문자 (단축키 : 모두 대문자 : ctrl+shift+x/ 모두 소문자 : ctrl+shift+y)
	//글자연결시 언더스코어(_)를 붙여준다. 언더스코어는 상수에서만 쓰기.
	//상수는 선언과 동시에 초기화해야함.
	static final double EARTH_RADIUS = 6400; //지구의 반지름은 1개이므로 상수로 표현
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;

	public static void main(String[] args) {
		Car car = new Car(); //
		System.out.println(car);
	}
	
}
