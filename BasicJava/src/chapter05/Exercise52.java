package chapter05;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lottoNums = new int[6];
		System.out.println("로또 번호는");
		for (int i = 0; i < lottoNums.length; i++) {
			lottoNums[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoNums[i] == lottoNums[j]) {
					i--;
				}
			}
		}
		for (int x = 0; x < lottoNums.length; x++) {
			System.out.println(lottoNums[x]);
		}
	}
}
