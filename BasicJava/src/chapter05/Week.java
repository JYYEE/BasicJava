package chapter05;

public enum Week {
	SUNDAY("일요일"), MONDAY("월요일"), TUESDAY("화요일"), WEDNESDAY("수요일"), 
	THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");
	//ctrl + shift + x : 모두 대문자로 변경
	//ctrl + shift + y : 모두 소문자로 변경
    //오타 있으면 수정 -> alt + shift + r : 모든파일에 있는 열거상수 다 수정가능
	String korName;
	Week(String name){
		korName = name;
	}
}
