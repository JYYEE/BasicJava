package chapter11.a.String;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "   1234    ";
		
		// 앞뒤 공백을 잘라도 중간 공백은 제거하지 않음.
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
