package chapter04;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int num1 = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int num2 = scanner.nextInt();
		System.out.print("화면 구현: ");
		int num3 = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int num4 = scanner.nextInt();
		System.out.print("머신러닝: ");

		int num5 = scanner.nextInt();
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println("총점: " + sum);

		double average = (double) sum / 5; // (double) 캐스팅 안하고 sum/5.0 이면 자동 캐스팅
		System.out.printf("평균: %.2f\n" , average); //소수점 둘째자리까지 출력됨

		if (average >= 90) {
			System.out.println("학점: A");
		} else if (average >= 80) {
			System.out.println("학점: B");
		} else if (average >= 70) {
			System.out.println("학점: C");
		} else if (average >= 60) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}
		scanner.close();
	}
}
// double avg =419 / 5.0; 이면 소수점 첫째자리까지 나옴
// System.out.printf("%.2f", avg);
