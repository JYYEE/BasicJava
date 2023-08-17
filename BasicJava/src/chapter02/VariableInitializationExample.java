package chapter02;

public class VariableInitializationExample {
	public static void main(String[] args) {
		int value = 0; // 변수 선언 변수=value, 정수인 값을 가짐/ 변수 초기화 안하면 컴파일 에러
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value+10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
	}

}
