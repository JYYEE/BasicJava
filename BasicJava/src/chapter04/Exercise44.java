package chapter04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");

		System.out.print("철수: ");
		String str1 = scanner.nextLine();
		System.out.print("영희: ");
		String str2 = scanner.nextLine();
		boolean vic1 = ("가위".equals(str1) && "보".equals(str2)) || ("바위".equals(str1) && "가위".equals(str2))
				|| ("보".equals(str1) && "바위".equals(str2));
		boolean vic2 = ("가위".equals(str2) && "보".equals(str1)) || ("바위".equals(str2) && "가위".equals(str1))
				|| ("보".equals(str2) && "바위".equals(str1));
		if (vic1) {
			System.out.println("결과: 철수 승리!");
		} else if (vic2) {
			System.out.println("결과: 영희 승리!");
		} else {
			System.out.println("결과: 비겼다.");
		}
		scanner.close();
	}

}
