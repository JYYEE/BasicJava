package chapter10.b;

public class TryCatchExample {
	public static void main(String[] args) {
		// 일반예외(Exception) : 빨간 밑줄 생김 --> 컴파일이 미리 에러 알려줌
		try {//try : 블록을 실행 -> 정상적으로 동작 -> 끝
			//에러 발생 -> catch가 에러를 잡음. () 안: 에러에 대한 정보
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) { 
			//가장 상위타입으로 변수타입(Exception)을 설정하여 하위타입 예외를 모두 잡음
			e.printStackTrace();
		} finally {
			//에러가 발생하든 발생하지 않든 마지막에 무조건 실행을 보장. 
			//try문이나 catch문에 return문이 있어도 실행.
			//공유하는 하드웨어 자원을 반납하기 위함. ex)scanner.close();
			System.out.println("실행 끝");
		}

		// 실행예외(Runtime Exception) : 실행해야 오류가 나는지 알 수 있음
		String name = null;
		System.out.println(name.contains("홍"));
	}

}
//콘솔창 에러 가장 마지막 줄이 가장 먼저 발생한 에러 -> 가장 밑에부터 에러 찾아가기