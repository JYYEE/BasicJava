package chapter03;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//메트로폴리스 조건 - 수도, 총인구 100만이상 또는 연소득 50만 이상
		System.out.print("수도입니까?(수도: 1, 수도아님: 0) ");
		int a = scanner.nextInt(); //a=1일 때 메트로
		
		System.out.print("총 인구는?(단위: 만) ");
		int b = scanner.nextInt(); //b>=100
		
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
		int c = scanner.nextInt(); //c>=50
		
		
		//char metro = (a == 1 && b>=100) ? 'B' : (c>=50 ? 'B' : 'A');
		//A : 메트로폴리스가 아니다 B : 메트로폴리스다
		//조건을 나누지 말고 하나로 합쳐서 만들기
		char metro = (a == 1 && b>=100) || (c>=50) ? 'B' : 'A';
		System.out.println(metro=='B' ? "이 도시는 메트로폴리스입니다." : "이 도시는 메트로폴리스가 아닙니다.");
		
		scanner.close();
	}

}
