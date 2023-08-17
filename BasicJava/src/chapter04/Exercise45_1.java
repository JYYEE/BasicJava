package chapter04;

import java.util.Random;
import java.util.Scanner;
// 몇번만에 맞췄는지 횟수 구해보기
public class Exercise45_1 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int ranNum = random.nextInt(100)+1;
		int count = 0; // while 동안 카운트 횟수 추가
		while (true) {
			System.out.print("1부터 100 사이의 정수 입력: ");
			count++; //
			int inputNum = scanner.nextInt();
			if(ranNum > inputNum) {
				System.out.println("정답은 더 큰 수 입니다.");
			} else if(ranNum < inputNum) {
				System.out.println("정답은 더 작은 수 입니다.");
			} else {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println("시도한 횟수: " + count +"번 입니다.");
		System.out.println("게임을 종료합니다.");
		scanner.close();
	}
}