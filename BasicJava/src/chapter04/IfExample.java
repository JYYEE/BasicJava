package chapter04;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		//if (score < 90)
			//System.out.println("점수가 90보다 작습니다.");
		//System.out.println("등급은 B입니다."); // 중괄호 작성 안해서 if문으로 인식x //들여쓰기 안맞음 -> if 문 아님
		//중괄호 작성 안하면 if 다음 아래 한줄까지 if문 => if문 작성할 때 중괄호 하는거 추천
		//정렬이 안맞는다 ctrl + shift + f 누르면 자바스타일로 자동정렬
		//else도 중괄호 꼭 써주기
		if (score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}

}
