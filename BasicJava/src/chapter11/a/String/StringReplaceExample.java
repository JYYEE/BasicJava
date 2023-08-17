package chapter11.a.String;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		//정규표현식(Regular Expression) : 대치하고 싶은 문자열을 패턴으로 찾아서 대치할 수 있음.
	}

}
