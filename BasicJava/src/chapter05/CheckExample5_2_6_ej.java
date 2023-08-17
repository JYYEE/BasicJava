package chapter05;

import java.util.Scanner;

public class CheckExample5_2_6_ej {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int [] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					scores[i]= Integer.parseInt(scanner.nextLine());
					System.out.println("scores[" +i+"]> ");
				}
				
				
/*				System.out.print("scores[0]> ");
				int score0 = Integer.parseInt(scanner.nextLine());
				System.out.print("scores[1]> ");
				int score1 = Integer.parseInt(scanner.nextLine());
				System.out.print("scores[2]> ");
				int score2 = Integer.parseInt(scanner.nextLine());
				scores = new int[] {score0, score1, score2};  
*/				
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> "+scores[i]);
					
				}
			} else if(selectNo == 4) {
				int total = 0;
				int top = 0;
				
				for(int i=0; i<scores.length; i++) {
					total += scores[i];
					if(scores[i] > top) {
						top=scores[i];
					}
				}
				double avg = (double) total/scores.length;
				System.out.println("최고 점수: "+top);
				System.out.println("평균 점수: "+avg);
/*				int sum = scores[0]+scores[1]+scores[2];
				double avg = (double) sum/studentNum;
				System.out.println("최고 점수 : "+ max);
				System.out.println("평균 점수: "+ avg);
	*/		
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
