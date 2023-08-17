package chapter04;

import java.util.Scanner;

public class Exercise44_ver2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");

		System.out.print("철수: ");
		String str1 = scanner.nextLine();
		System.out.print("영희: ");
		String str2 = scanner.nextLine();
	
		if(str1.equals("가위")) {
			if(str2.equals("바위")){
				System.out.println("결과: 영희 승리!");
			} else if(str2.equals("보")){
				System.out.println("결과: 철수 승리!");
			} else {
				System.out.println("결과: 비겼다.");
			}
		}
		
		if(str1.equals("바위")) {
			if(str2.equals("보")){
				System.out.println("결과: 영희 승리!");
			} else if(str2.equals("가위")){
				System.out.println("결과: 철수 승리!");
			} else {
				System.out.println("결과: 비겼다.");
			}
		}
		
		if(str1.equals("보")) {
			if(str2.equals("가위")){
				System.out.println("결과: 영희 승리!");
			} else if(str2.equals("바위")){
				System.out.println("결과: 철수 승리!");
			} else {
				System.out.println("결과: 비겼다.");
			}
		}
		scanner.close();
	}
}