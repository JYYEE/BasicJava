package chapter03;

public class CheckExample4 {
	public static void main(String[] args) {
		int pencils =534;
		int students =30;
		
		//학생 1명이 가지는 연필 개수
		int pecilsPerStudent = pencils/students;
		System.out.println(pecilsPerStudent);
		
		//남은 연필의 개수
		int pecilsLeft = pencils%students ;
		System.out.println(pecilsLeft);
	}

}
