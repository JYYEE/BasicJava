package chapter08.ex.a;

public class Triangle extends Shape{
	//필드
	private double side;

	//생성자
	public Triangle(double side) {
		super();
		this.side = side;
	}
	
	//메소드
	@Override
	public double area() {
		return Math.sqrt(3) * side * side / 4; // double이니깐 4.0으로 나눠주면 좋음.
	}
	@Override
	public double perimeter() {
		return 3 * side;
	}
	@Override
	public String toString() {
		return String.format("도형의 종류: 삼각형, " + super.toString());
	}

}
