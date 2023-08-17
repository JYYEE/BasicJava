package chapter10.b;

public class ThrowsExample {
	public static void main(String[] args) throws Exception  {
		method();
		// 예외를 발생시키기 => 예외를 만든다. => 만든다(new)
		// throw를 사용
		// 예외를 발생시켜 처리하기 위해 throws나 try-catch 이용해서 처리
		throw new Exception(); // 개발자가 직접 에러를 만드는 코드
	}

	private static void method() throws ClassNotFoundException {
		Class.forName("java.lang.String");
	}

}
// 에러를 여러개 묶어줄 때는
// throws ClassNotFoundException , 에러2 이렇게 표현
// throws 에러 -- 에러의 하위타입은 다 던져버림
// 그래서 에러의 상위타입만 하나로 작성함
// throws Exception
// 결국 어디서든 예외는 처리 방법 필요.
// 지금은 try-catch 문으로 각각의 예외를 처리해줄 것.
