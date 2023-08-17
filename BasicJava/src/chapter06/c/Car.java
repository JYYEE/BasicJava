package chapter06.c;

public class Car {
// 중복코드 줄임
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car() {
		this(null, null, 0);
	}

	Car(String model) {
		this(model, null, 0);
	}

	Car(String model, String color) {
		this(model, color, 0);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}
}


