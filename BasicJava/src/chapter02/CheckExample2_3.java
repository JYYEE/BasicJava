package chapter02;

public class CheckExample2_3 {
	public static void main(String[] args) {
		float floatValue = 2.5F;
		float result = 5+floatValue;
		System.out.println(result);// 결과값 7.5 float 타입이어도 결과로 산출할 때는 F 붙지 않고 나옴
		
		double var1 =3.5;
		double var2 =2.7;
		int result2 = (int) (var1 + var2);
		System.out.println(result2);
		
		long v1 = 2L;
		float v2 = 1.8f;
		double v3 = 2.5;
		String str1 = "3.9";
		int result3 = (int)(v1+v2+v3)+(int)Double.parseDouble(str1);
		System.out.println(result3);
		
	
	}

}
