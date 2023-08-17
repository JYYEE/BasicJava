package chapter10.ex;

import java.util.Scanner;

public class Exercise101 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("어떤 수를 나누시겠습니까?>> ");
				int firstNum = Integer.parseInt(scanner.nextLine()); 
				//scanner.nextInt() 로 받으면 문자를 입력받고 숫자를 입력받을 때 버그 발생 
				//scanner에서 nextLine을 제외한 나머지는 공백이나 엔터까지 글자를 받아서 리턴함.
				//a 입력시 엔터치면 엔터를 제거하는 동작 실행 못하고 끝나게 됨.
				//엔터가 지워지지 않고 남아있어서 while문으로 다시 실행하게 되면 엔터를 입력값으로 받아서 무한루프돌게됨
				//가장 좋은 방법은 nextLine 으로 받아서 이를 정수나 실수로 변환하는 것이 제일 좋음.
				System.out.print("어떤 수로 나누시겠습니까?>> ");
				int secondNum = Integer.parseInt(scanner.nextLine());
				int result = firstNum / secondNum;
				System.out.println(firstNum + "/" + secondNum + " = " + result);
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				//scanner.next(); 추가하면 nextInt로 받았던 공백이 제거됨
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}
		scanner.close();
	}
}
