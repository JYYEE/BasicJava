package chapter06.c;
// 중복코드 안줄임
public class Carcode {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Carcode() {
		
	}

	Carcode(String model) {
		this.model = model;
	}

	Carcode(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Carcode(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}
}
