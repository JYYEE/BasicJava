package chapter11.b;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();// 1.날짜 정보를 출력하기 위해 객체 생성 --> 시간은 흘러가는데 메모리상, 보안상 문제가 발생
//		String dateString = date.toString(); //
//		System.out.println(dateString);// 실행할때의 시간
		//날짜 포맷팅(원하는 형식으로 출력) SimpleDataFormat
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss.SSS");//2
		String format = dateFormat.format(date);//3
		System.out.println(format);//4
		
		
		Calendar calendar = Calendar.getInstance(); // new 보다 좋은 방법. 싱글톤 객체로 불러옴.
		// 캘린더는 각각 다 꺼내서 변수에 저장한 후에 써야함 --> 복잡
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH); //1월이 0이고 12월이 11 --> +1 해줘야함
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int milliSecond = calendar.get(Calendar.MILLISECOND);
		int dayOfWeek = calendar.get(Calendar.DATE);
		
		System.out.printf("%04d-%02d-%02d %02d:%02d:%02d.%03d %d", year, month+1, day, hour, minute, second, milliSecond, dayOfWeek);
		
		
	}

}
