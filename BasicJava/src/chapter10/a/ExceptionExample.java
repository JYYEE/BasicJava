package chapter10.a;

public class ExceptionExample {
	public static void main(String[] args) {
		//일반예외(Exception) : 빨간 밑줄 생김 --> 컴파일이 미리 에러 알려줌
		//Class.forName("java.lang.String");
		
		//실행예외(Runtime Exception) : 실행해야 오류가 나는지 알 수 있음
		String name = null;
		System.out.println(name.contains("홍"));
		
		
	}

}
