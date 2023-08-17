package chapter08.b;

public class Member implements Comparable<Member> {
	private String name;
	private int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
		return "Member [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name); 
		//가나다 이름순 정렬. 거꾸로 정렬하고 싶으면 -name.compareTo(0.name); 으로 두기.
		// 나이순 정렬
//		if(age > o.age) {
//			return 1;
//		} else if (age == o.age) {
//			return 0;
//		} else {
//			return -1;
//		} 
	}
	

}
