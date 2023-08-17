package chapter02;

public class Exercise22 {
	public static void main(String[] args) {
		
		double var1 = 40e12;
		double var2 = 3e5;
		double var3 = var2*365*24*60*60;
		
		double result = var1/var3;
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + result + "광년이다.");
	
	}
}
