package chapter06;

public class Time {
	// 필드
	private int hour;
	private int minute;
	private int second;

	// 생성자
	public Time() {
		this(0,0,0); // 안쓰면 기본적으로 0으로 초기화되므로 안써도 됨.
	}

	public Time(int hour, int minute, int second) {
		if(hour>0 && hour<24) {
			this.hour = hour;	
		} 
		if(minute>0 && minute <60) {
			this.minute = minute;	
		}
		if(second>0 && second<60) {
			this.second = second;			
		}
	}
	
	// 메소드
	// private이라고 해서 getter, setter가 의무사항은 아님
	// 값을 세팅하는 생성자가 존재 또는 setter가 존재해야함
	// 여기서는 생성자가 존재함
//	public int getHour() {
//		return hour;
//	}
//	public void setHour(int hour) {
//		this.hour = hour;
//	}
//	public int getMinute() {
//		return minute;
//	}
//	public void setMinute(int minute) {
//		this.minute = minute;
//	}
//	public int getSecond() {
//		return second;
//	}
//	public void setSecond(int second) {
//		this.second = second;	
//	}
	
	
	public String toString() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
		//String.format = printf 랑 같은 역할
	}
}
