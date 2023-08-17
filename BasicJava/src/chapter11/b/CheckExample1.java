package chapter11.b;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckExample1 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleData = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		String format = simpleData.format(date);
		System.out.println(format);
	}

}
