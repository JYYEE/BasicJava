package chapter11.a;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(10);// boxing : 기본타입 데이터 --> 참조
		int bb = b.intValue(); // unboxing : 참조 --> 기본타입 데이터
		Boolean c = new Boolean(false);
		
		Integer d =10; //자동박싱(auto boxing)
		int e = new Integer(10);// 자동 언박싱(auto unboxing)
		
		
	}

}
