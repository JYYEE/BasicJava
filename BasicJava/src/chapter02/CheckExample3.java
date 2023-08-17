package chapter02;

import java.util.Scanner;

public class CheckExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1.이름: ");
		String str1 = scanner.nextLine();
		System.out.print("2.주민번호 앞 6자리: ");
		String num1 = scanner.nextLine();
		System.out.print("3.전화번호: ");
		String str2 = scanner.nextLine(); // line -> int -> line으로 받으면 버그 생김 
		System.out.println("");
		System.out.println("1.이름: "+str1);
		System.out.println("2.주민번호 앞 6자리: "+num1);
		System.out.println("3.전화번호: "+str2);
		
		scanner.close();
	}
}
