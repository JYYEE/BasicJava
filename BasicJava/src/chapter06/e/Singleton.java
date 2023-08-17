package chapter06.e;
// Singleton 생성되는 형식 외우기
public class Singleton {
	private String name;
	// 기본 생성자 생략되어 있음
	// 필드에 싱글톤 객체 저장
	private static Singleton instance = new Singleton(); 
	// 내부에서 만든 Singleton을 instance에 저장
	// 객체를 사용하려면 Singleton 만들어야하는데 private로 막아서 생성x --> 객체 생성없이 사용할 수 있어야함. --> static
	// 필드는 무조건 private --> get 메소드로 접근
	private Singleton() {// 외부에서 무분별하게 불러오는것 막음. 내부에서 1개 만듦
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		}

}
