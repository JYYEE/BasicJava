package chapter08.ex.a;

public abstract class Shape implements Comparable<Shape> { 
	//Shape끼리 비교할거라서 <> 안에 Shape
	//필드
	//생성자
	//메소드
	public Shape() {}
	public abstract double area(); 
	
	public abstract double perimeter();
	
	@Override
	public int compareTo(Shape o) { 
		//오름차순 기준. 사전식 배열기준(문자열도 비교 가능함)
		//this 현재 객체보다 매개변수specified object가 크면 양수 
		//작으면 음수 같으면 0을 반환
		//내림차순으로 정렬하고 싶으면 반환값을 각각 -1, 0, 1로 바꿔주면 됨
		if(area() > o.area()) {			
			return 1;
		} else if (area() == o.area()) {
			return 0;
		} else {
			return -1;
		} 
	}
	@Override
	public String toString() {
		return String.format("둘레: %.2fcm, 넓이: %.2f㎠", perimeter(), area());
	}	
}
