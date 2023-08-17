package chapter06.a;

public class TumblerExample {
	public static void main(String[] args) {
		// stack area     heap area에 만들어짐
		Tumbler tumbler1 = new Tumbler(); //Tumbler에 ctrl+클릭 -> Tumbler 클래스로 이동
		Tumbler tumbler2 = new Tumbler();
		Tumbler tumbler3 = new Tumbler();
		Tumbler tumbler4 = new Tumbler();
		System.out.println(tumbler1);
		System.out.println(tumbler2);
		System.out.println(tumbler3);
		System.out.println(tumbler4);
		
	}

}
