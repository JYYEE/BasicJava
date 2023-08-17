package chapter05;

public class Exercise51 {
	public static void main(String[] args) {
		int[] numArray = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };
		int max = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (max < numArray[i]) {
				max = numArray[i];
			}
		}
		int min = max;
		for (int i = 0; i < numArray.length; i++) {
			if (min > numArray[i]) {
				min = numArray[i];
			}
		}
		System.out.println("다음 배열의 최댓값은 " + max + "이다.");
		System.out.println("다음 배열의 최솟값은 " + min + "이다.");
	}
}
