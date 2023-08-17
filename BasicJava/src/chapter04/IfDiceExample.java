package chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
		Random random = new Random(); //new ra -> ctrl+ 스페이스 -> 선택 임포트까지 완료 -> ctrl+1 -> 선택
		// Random() 괄호 비어있으면 중복x, ()안에 숫자(=시드)가 있으면 시드가 같은 숫자끼리는 같은 랜덤 나옴
		//SecureRandom ; 보안을 설정한 랜덤
		int ranNum1 = random.nextInt(6) +1; //0,1,2,3,4,5까지 6개를 반환 + 시작숫자. 랜덤쓸 때 사용하기
									        //int ranNum2 = (int)(Math.random()*6)+1; 위와 같은것
		int ranNum2 = random.nextInt(6) +1;
		int ranNum3 = random.nextInt(6) +1;
		int ranNum4 = random.nextInt(6) +1;
		int ranNum5 = random.nextInt(6) +1;
		int ranNum6 = random.nextInt(6) +1;
		int ranNum7 = random.nextInt(6) +1;
		int ranNum8 = random.nextInt(6) +1;
		System.out.println(ranNum1);		 
		System.out.println(ranNum2);		 
		System.out.println(ranNum3);		 
		System.out.println(ranNum4);		 
		System.out.println(ranNum5);		 
		System.out.println(ranNum6);		 
		System.out.println(ranNum7);		 
		System.out.println(ranNum8);		
		//단축키 : ctrl+alt+방향키 아래 - 똑같은 것 아래로 복사
		//단축키 : alt+shift+a - 세로열 같은것끼리 복사 붙여넣기 가능 해제할때 다시 누름
		
		//for 문으로 바꿔보기
		//for(int i=1 ; i<=8 ; i++) {
		//System.out.println(random.nextInt(6) +1);} 사용가능
		
	}

}




