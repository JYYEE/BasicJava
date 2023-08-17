package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 바위 보를 입력하세요: ");
		String gamer = scanner.nextLine();
		System.out.println("게이머: " + gamer);
		
		String com = null;
		Random random = new Random();
		int num = random.nextInt(3);
		// 숫자배열 대신에 String[] aiArray = { 가위, 바위, 보}; 로 하는게 키포인트 
		// 가위 : 0, 바위: 1, 보:2 --> 뺐을 때 결과값이 1이면 이김, 0이면 비김, 그 외 짐 같은 방법도 가능
		switch (num) {
		case 0:
			com = "가위";
		case 1:
			com = "바위";
		case 2:
			com = "보";
		}
		System.out.println("인공지능 컴퓨터: " + com);

		if (gamer.equals("가위") && com.equals("보") || gamer.equals("바위") && com.equals("가위")
				|| gamer.equals("보") && com.equals("바위")) {
			System.out.println("결과: 게이머 승리!");
		} else if (gamer.equals("가위") && com.equals("바위") || gamer.equals("바위") && com.equals("보")
				|| gamer.equals("보") && com.equals("가위")) {
			System.out.println("결과: 인공지능 컴퓨터 승리!");
		} else {
			System.out.println("결과: 비겼다");
		}
		scanner.close();
	}
}
