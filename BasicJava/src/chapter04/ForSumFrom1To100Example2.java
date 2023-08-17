package chapter04;

public class ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i= 0;
		for (i = 1; i <=100 ; i++) {
			sum += i;
			
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		//i가 100까지 하면 그 다음 i가 101이 됨 그 이후 false 이므로 출력 안되고 그 때 i=101이라 i-1=100이 될 수 있는 것
	}

}
