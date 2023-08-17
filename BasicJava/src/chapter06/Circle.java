package chapter06;

public class Circle {
	//필드
	private double radius; //반지름
	private double x; // x좌표
	private double y; // y좌표
	
	//생성자
	public Circle() {}
	
	//메소드
	public double getArea() { // 메소드에도 public 붙여주기
		return Math.PI * radius *radius;
	}
	
	//getter와 setter
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius<0) {
			this.radius = 0;
			return;
		}
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}
