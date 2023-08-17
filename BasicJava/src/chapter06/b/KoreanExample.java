package chapter06.b;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println("k1.name : "+ k1.name);
		System.out.println("k1.ssn : "+ k1.ssn);
		// 생성자에 넣어준 "박자바" 가
		//  korean class에 String n="박자바"에 저장됨.
		Korean k2 = new Korean("김자바", "930525-1654321");
		//k2.name="김자바";
		//k2.ssn ="930525-1654321";
		
		Korean k3 = new Korean("최자바", "011122-4455667");
		//k3.name="최자바";
		//k3.ssn ="011122-4455667";
		System.out.println(k2.name);
		System.out.println(k3.ssn);
	}

}
