package chapter06;

public class Plane {
	// 필드
	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;

	// 생성자
	public Plane() {
		numberOfPlanes++; // 여기를 지우려면 this(null,null,0); 대신 사용.
	}

	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++;// 위에랑 중복코드 --> 대신 this(); 쓰면 위에로 가면서 numberOfPlanes++ 성립.
	}

	// 메소드
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers>0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;			
		}
	}
	
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}

	public String toString() {
		return String.format("%d", numberOfPlanes);
	}
}
