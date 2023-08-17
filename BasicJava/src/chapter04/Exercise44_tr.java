package chapter04;

import java.util.Scanner;

public class Exercise44_tr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");

		System.out.print("철수: ");
		String cheolsu = scanner.nextLine();
		System.out.print("영희: ");
		String yeonghee = scanner.nextLine();
		
		String result = "";
		
		if (cheolsu.equals(yeonghee)) {
			result = "비겼습니다.";
		} else if (cheolsu.equals("가위") && yeonghee.equals("바위") 
				|| cheolsu.equals("바위") && yeonghee.equals("보") 
				|| cheolsu.equals("보") && yeonghee.equals("가위") ) {
			result = "영희 승리!";
		} else {
			result = "철수 승리!";
		}
		System.out.println("결과 : " + result);
		scanner.close();
		
	}

}
// && 우선실행 그래서 괄호 없어도 됨
//17~25은 1번시험에, 통으로 외우기 2번시험에