package chapter05;

import java.util.Random;

public class Exercise52_ver2 {
	public static void main(String[] args) {
		Random random = new Random();
		int [] lottoArray = new int[45]; // 모든 배열값은 0으로 초기화 
		System.out.println("로또 번호는");
		for(int i=0; i<lottoArray.length; i++) {
			lottoArray[i]=i+1;
		}
		for(int j=0; j<lottoArray.length; j++) {
			int ranNum = random.nextInt(45);
			int temp;
			temp = lottoArray[j];
			lottoArray[j]=lottoArray[ranNum];
			lottoArray[ranNum]=temp;
		}
		for(int k=0; k<6; k++) {
			if(k!=0) {
				System.out.print(", "); // 콤마를 앞에 붙이고 맨 처음 실행x
			}
			System.out.print(lottoArray[k]);
		}
	}
}
// main
// int [] arr = new int[45];
// for(int i=0; i<arr.length; i++){
// arr[i]=i+1;}
// Random random = new Random();
// for(int i=0; i<arr.length; i++) {
//int ranNum = random.nextInt(45);
//int temp = arr[0];
//arr[0]=arr[ranNum];
//arr[ranNum]=temp;
//}
//for(int i=0; i<6; i++) {
//	System.out.println(arr[i]+ " ");
//}
