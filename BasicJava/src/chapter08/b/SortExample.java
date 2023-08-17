package chapter08.b;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		//정렬 알고리즘 sorting 
		//탐색(검색)
		
		int[] numbers = {4, 2, 9, 1, 6, 7, 8, 3}; 
		//숫자 정렬은 가능. 문자는 정렬 안됨. (크다 작다 비교 안되서)
		String[] names = {"박승우", "배문기", "박정수", "오미나",
				          "이지영", "정은지", "전지혜"};
		
		System.out.println(Arrays.toString(names));
		System.out.println();
		Arrays.sort(names); //인터페이스가 구현된 객체를 대입하면 구현
		System.out.println(Arrays.toString(names)); // 가나다 순으로 배열됨
	}

}
