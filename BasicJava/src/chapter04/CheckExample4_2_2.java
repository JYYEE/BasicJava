package chapter04;

public class CheckExample4_2_2 {
	public static void main(String[] args) {
//		int sum=0;
//		
//		for(int i=0; i<=100; i +=3) {
//			sum +=i;
//		
		int sum2=0;
		for(int j=3; j<=100  ; j++) {
			if(j%3==0) {
				sum2 +=j;
			}
		}
		System.out.println("1~100의 3의 배수의 합 : " + sum2);
		
	}

}
