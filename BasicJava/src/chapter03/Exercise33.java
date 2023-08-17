package chapter03;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		
		int var1 = scanner.nextInt();
		//char year = (var1%4 == 0) && !(var1%100 ==0) ? 'A' : (var1%400==0 ? 'A' : 'B');
		//조건을 모두 하나로 합쳐서 만들기
		char year = (var1%4 == 0) && !(var1%100 ==0) || (var1%400==0) ? 'A' : 'B';
		System.out.println(year=='A' ? var1 + "년은 윤년입니다." : var1 + "년은 윤년이 아닙니다." );
		scanner.close();
	}

}
