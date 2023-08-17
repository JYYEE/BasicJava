package chapter07.a;

public class People {
	public String name; // private이면 자식 클래스에서 사용 불가.
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
