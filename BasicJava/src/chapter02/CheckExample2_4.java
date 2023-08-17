package chapter02;

import java.util.Scanner;

public class CheckExample2_4 {
	public static void main(String[] args) {
		System.out.printf("이름: %s", "자바");
		System.out.printf("나이: %d", 25);
		
		System.out.printf("이름: %1$s, 나이: %2$d, 성별: %3$s", "자바", 25, "여\n");
		
		Scanner scanner = new Scanner(System.in);
		String inputData = scanner.nextLine();
		System.out.println(inputData);
		scanner.close();
	}

}
