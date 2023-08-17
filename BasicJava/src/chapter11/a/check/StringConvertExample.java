package chapter11.a.check;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		// 또 다른 방법 String strData2 = intData2 + "";
	}

}
