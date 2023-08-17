package chapter07.ex.a;

public class Student extends Human {
	//필드
	private String major;

	//생성자
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	//메소드
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		//return String.format(super.toString()+",전공: " +major);
		return super.toString()+",전공: " +major;
	}
	

}
