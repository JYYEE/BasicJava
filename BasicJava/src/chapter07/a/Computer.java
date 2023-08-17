package chapter07.a;

public class Computer extends Calculator {
	
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행"); 
		return Math.PI * r * r; // 재정의
	}
	

}
