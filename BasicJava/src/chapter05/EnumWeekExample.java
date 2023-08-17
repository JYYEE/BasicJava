package chapter05;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		// 열거형(enumeration) => Singleton 형태로 객체를 만들어 준다. 
		Calendar calendar= Calendar.getInstance();
		int week =calendar.get(Calendar.DAY_OF_WEEK); // 		
		Week today = null; //Week : 타입, today : 변수
		switch(week) {
		case 1: 
			today = Week.SUNDAY;
			//Week today = Week.SUNDAY; 이렇게 시작해서 today에서 ctrl+1 하면 split -> 선언과 초기화 분리
			//선언 부분 앞부분으로 올려야 모든 case에서 사용 가능
			break;			
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일: "+today); // 초기화 안되어 있으면 실행x 초기화 필요 -> null값
		//System.out.println("오늘 요일: "+today.korName);// 앞에서 정의된 korName 출력
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}

}
