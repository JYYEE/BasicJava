package chapter03;

public class CheckExample10 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		String str = var2 + "."+ var3;
		double pi = Double.parseDouble(str);
		
		double var4 = var1*var1*pi;
		System.out.println("원의 넓이: " + var4);
	}

}
