package chapter11.a.check;

import java.util.Arrays;

public class BytesToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes) ;
		System.out.println(str);
		
		//반대로도 가능
		String str2 = "You love me";
		byte[] bytes2 = str2.getBytes();
		System.out.println(Arrays.toString(bytes2));
		
		String str3 = "한글도 가능합니다.";
		byte[] bytes3 = str3.getBytes();
		System.out.println(Arrays.toString(bytes3));// 범위가 -128~127까지라 음수도 나옴.
	}

}
