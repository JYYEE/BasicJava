package chapter04;

public class CheckExample4_2_4 {
	public static void main(String[] args) {
		int x;
		int y;
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				
				if(4*x+5*y==60) {
					System.out.println("(" + x + ","+ y + ")"); //위치 중요
				}
			}
			
		}
	}

}
