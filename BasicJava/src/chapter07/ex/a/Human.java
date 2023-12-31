package chapter07.ex.a;

public class Human {
	//필드
	private String name; //이름
	private int age;     //나이
	
	//생성자
	public Human() {}
	// 필드 이후 ctrl + space --> 기본 생성자 제일 먼저 나옴

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		//return String.format("이름: "+ name + ",나이: " + age);
		return "이름: "+ name + ",나이: " + age; 
	}
	
	
}
