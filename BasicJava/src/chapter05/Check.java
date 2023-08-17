package chapter05;

import java.util.Random;

public class Check {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lottoNums = new int[6];
		
		for(int i=0; i<lottoNums.length; i++) {
			lottoNums[i] = random.nextInt(45) + 1;
			for(int j=0; j<i; j++) {
				if(lottoNums[i]==lottoNums[j]) {
					i--;
					System.out.println("lottoNums[i]= " + lottoNums[i]+ ", lottoNums[j]= "+lottoNums[j]);
					System.out.println("i= " + i+ ", j= "+ j);
					
				}
				
			}
			
		}
		
		
	}

}
