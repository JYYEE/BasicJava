package chapter06;
// 내부 -> 외부 mileToKillo (get) -- 안에서 밖으로 내보내는것
// 외부 -> 내부 killoToMile (set) -- 밖에서 안으로 갖고 들어오는 것
// 1mile = 1.6km
// distance 는 km로 들어오므로 이를 mile로 환산
// 1km = 1/1.6 mile, 1 mile = 1 * 1.6km 
//설계를 할 때 소스를 최소화하면서 원하는 바를 이룰 수 있음
//좋은 문제
public class NewCar {
	//필드
	private double speed; // 내부적으로 mile
	private String color;
	private static final double MAX_SPEED = killoToMile(200.0);
	
	//생성자
	public NewCar() {}
	public NewCar(String color) {
		this.color = color;
	}
	
	//메소드
	public double getSpeed() {
		return mileToKillo(speed);
	}
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);			
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean speedUp(double speed) {
		// speed = killoToMile(speed); 로 두고 해도 됨.
		if(this.speed+killoToMile(speed)<0 || this.speed+killoToMile(speed)>MAX_SPEED) {
			return false;
		} else {
			this.speed +=killoToMile(speed);
			return true;
		}
	}
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	
	// 입력받은 값 km -> mile로 바꿔야하니깐 km/1.6
	private static double killoToMile(double distance) {
		return distance / 1.6;
	}
	
	// 입력받은 값 mile -> killo로 바꿔야하니깐 mile*1.6 
	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}
	public String toString() { // 메모리상 객체값을 확인하기 위함. 문제에서는 상관x. 
		return String.format("%.1fkm/h", speed);
	}
}
