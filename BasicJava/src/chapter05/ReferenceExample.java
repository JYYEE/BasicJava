package chapter05;

public class ReferenceExample {
	public static void main(String[] args) {
		String c = "홍길동";
		String d = "홍길동";
		System.out.println(c == d); //"홍길동" 이란 단어가 heap 안에 string pool에 저장되어서 같은 주소값을 참조함
		System.out.println(c.equals(d));
		String a = new String("홍길동");
		String b = new String("홍길동"); //new 가 있으면 heap안에 각각 생성 -> 주소값 달라짐
		System.out.println( a==b );
		System.out.println(a.equals(b));
	}

}
