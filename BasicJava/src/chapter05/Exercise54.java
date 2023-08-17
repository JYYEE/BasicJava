package chapter05;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] dice = new int[6];
		System.out.println("---------------");
		System.out.println("면      빈도");
		System.out.println("---------------");

		for (int j = 0; j < 10000; j++) {
			int numj = random.nextInt(6);
//			dice[numj] ++; 
			// 배열 인덱스에는 연산식이 안들어가는걸 추천
			// 배열의 숫자는 안건들이고 범위를 바꿔주는게 좋음
			switch (numj) {
			case 0:
				dice[0]++;
				break;
			case 1:
				dice[1]++;
				break;
			case 2:
				dice[2]++;
				break;
			case 3:
				dice[3]++;
				break;
			case 4:
				dice[4]++;
				break;
			case 5:
				dice[5]++;
				break;
			}
		}
		for (int i = 0; i < dice.length; i++) {
			System.out.println(i + 1 + "       " + dice[i]);
		}
	}

}
