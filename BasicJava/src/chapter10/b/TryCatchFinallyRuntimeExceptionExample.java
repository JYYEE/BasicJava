package chapter10.b;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) { 
		String data1;
		String data2;		
		try {// try 문 합치고 catch 문 나열 
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) { 
			// 여러개 에러 합칠 때는 
			// catch(ArrayIndexOutOfBoundsExceprion | 에러2 e) 이렇게 묶어줄 수 있다.
//			e.printStackTrace();
			System.out.println("실행 매개값의 수가 부족합니다.");
			return;
		} catch (Exception e) { // 상위 에러 클래스를 마지막에 배치
//			e.printStackTrace();
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}

