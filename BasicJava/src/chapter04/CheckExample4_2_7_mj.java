package chapter04;

import java.util.Scanner;

public class CheckExample4_2_7_mj {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");

			int chooseNum = scanner.nextInt();

			switch (chooseNum) {
			case 1:
				System.out.print("예금액>");
				int inNum = scanner.nextInt();
				balance += inNum;

				break;

			case 2:
				System.out.print("출금액>");
				int outNum = scanner.nextInt();
				balance -= outNum;

				break;

			case 3:
				System.out.println("잔고>" + balance);

				break;

			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
