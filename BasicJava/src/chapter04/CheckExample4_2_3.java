package chapter04;

import java.util.Random;

public class CheckExample4_2_3 {
	public static void main(String[] args) {
		Random random = new Random();
		
		while (true) {
			int x = random.nextInt(6) + 1;
			int y = random.nextInt(6) + 1;
			System.out.println("(" + x + "," + y + ")");
			if (x + y == 5) {
				break;
			}
		}
	}

}
