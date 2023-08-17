package chapter11.a.String;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // 인덱스값 0부터 5까지 추출
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 인덱스값 7부터 끝까지 추출
		System.out.println(secondNum);
	}

}
