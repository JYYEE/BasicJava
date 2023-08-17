package chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Random random = new Random();
		int ranNum1 = random.nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");

			int num1 = scanner.nextInt();
			if (ranNum1 > num1) {
				System.out.println("정답은 더 큰 수입니다.");
			} else if (ranNum1 < num1) {
				System.out.println("정답은 더 작은 수입니다.");
			} else {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				break;
				
			}
		}
		scanner.close();
	}
}
