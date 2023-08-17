package chapter04;

public class CheckExample4_2_6 {
	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=4; i++) {//행
			String empty ="";
			for(int j=4-i; j>0; j--) {//열
				empty +=" ";
				
			}
			str += "*";
			System.out.println(empty+str);
		}
	}

}
