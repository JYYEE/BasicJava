package chapter06;
//내부 외부 둘 다 속력의 단위를 km/h로 사용

public class Car {
	//필드
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;
	
	//생성자
	public Car() {}
	public Car(String color) {
		this.color = color;
	}
	
	//메소드
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;			
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean speedUp(double speed) {
		if(this.speed+speed<0 || this.speed+speed>MAX_SPEED) {
			return false;
		} else {
			this.speed +=speed;
			return true;
		}
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	public String toString() {
		 return String.format("%.1fkm/h", speed);
	}
}
