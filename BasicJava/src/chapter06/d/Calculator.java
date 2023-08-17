package chapter06.d;

public class Calculator {
	//반환되는 데이터 타입 없을 때 void
	void powerOn() {
		System.out.println("전원을 켭니다.");
		//return; - 써도 되고 안써도 되고. 필요 없어서 대부분 안씀.
		
	}
	
	//리턴할 타입이 있을 때는 return 필요. 
	//정의할 때는 타입 필요. 호출할 때는 타입 필요x
	int plus(int x, int y) {// int x = 10, int y = 20;
		return x + y;		
	}
	
	double divide(int x, int y) {
		return (double)x/y;		
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
