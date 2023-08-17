package chapter02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:"+ y);
		
		int temp = x; //새로운 변수 temp 선언 temp에 x 값 3저장
		x=y; // x에 y의 값 5 저장
		y=temp; // y에 temp의 값 3 저장
		System.out.println("x:"+x+", y:"+y);
	}
}
