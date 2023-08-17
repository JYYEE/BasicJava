package chapter04;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요(1~12): ");
		int num1 = scanner.nextInt();
		 
		if(num1==3 || num1==4 || num1==5) {
			System.out.println(num1 + "월은 봄입니다.");
		} else if(num1==6 ||num1==7 || num1==8) {
			System.out.println(num1 + "월은 여름입니다.");
		} else if(num1==9 ||num1==10 || num1==11) {
			System.out.println(num1 + "월은 가을입니다.");
		} else if(num1==12 || num1==1 || num1==2){
			System.out.println(num1 + "월은 겨울입니다.");
		} else {
			System.out.println(num1 + "월은 잘못된 입력입니다.");
		}
		scanner.close();
	}
}
//num1<=2 || num1=12, 먼저 쓰면 그다음 범위 num1<=5 만으로 가능
//3<=num && num <=5 하면 3이상 5이하 가능