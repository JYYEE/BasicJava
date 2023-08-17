package chapter03;

import java.util.Scanner;

public class CheckExample9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		double var1 = scanner.nextDouble();
		
		System.out.print("두번째 수 : ");
		double var2 = scanner.nextDouble();
		   
		System.out.println("--------------");
		
		if(var2==0 ) {
			System.out.println("결과 : 무한대");
		} else { if(var2==0.0) {
			System.out.println("결과 : 무한대");
		} else {
			System.out.println("결과 : " + var1/var2);
		}	
		}
		
		scanner.close();
	}

}
