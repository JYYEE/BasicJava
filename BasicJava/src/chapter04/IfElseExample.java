package chapter04;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		} //ifexample에서는 if절 2개 썼지만 여기서는 else절로 한꺼번에 표현
	}

}
