package chapter02;

public class VariableUseExample {
	   public static void main(String[] args) {
	         int hour = 3; //변수 선언 및 초기화 
	         int minute = 5; //변수 선언 및 초기화
	         System.out.println(hour + "시간" + minute + "분"); //변수 hour에 값으로 대치, minute에 값으로 대치
	         int totalMinute = (hour*60)+ minute; 
	         System.out.println("총" + totalMinute + "분");
	   }
}
