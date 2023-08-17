package chapter08.ex.a;

public class Circle extends Shape{
	//필드
	private double radius;
	
	//생성자
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//메소드
	@Override
	public double area() {
		return Math.PI * radius * radius ;
	}
	
	@Override
	public double perimeter() {
		return Math.PI * 2 * radius;
	}
	
	@Override
	public String toString() {
		return String.format("도형의 종류: 원, "+ super.toString() );
		//ㄹ + 한자키 --> 단위 기호 
	}
	

}
