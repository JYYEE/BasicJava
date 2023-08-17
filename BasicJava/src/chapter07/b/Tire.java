package chapter07.b;

public class Tire {
	// 필드
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		//super(); 원래 기본 default 자식클래스 아니면 object랑 연결됨.
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	// 메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
