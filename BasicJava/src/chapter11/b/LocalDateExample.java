package chapter11.b;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	public static void main(String[] args) {
		//LocalDate => 날짜만 사용 가능
		//LocalDateTime => 날짜와 시간도 사용 가능
		LocalDateTime now = LocalDateTime.now(); // 현재 시간을 반환
		System.out.println(now);
		
		//method chaining 방식 : .으로 계속 연결
		String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd E hh:mm:ss.SSS"));
		System.out.println(format);
		
		
	}

}
