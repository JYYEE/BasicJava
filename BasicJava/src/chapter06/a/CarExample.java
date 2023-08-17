package chapter06.a;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		System.out.println(car1.company);
		car1.speed =20;
		System.out.println(car1.maxSpeed);
		
		Car car2 = new Car();
		System.out.println(car2.speed);
		
		Car car3 = new Car();
		System.out.println(car3.model);
		
		
	}

}
