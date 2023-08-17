package chapter06.f;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed > 0) {
			this.speed = speed;			
		} // else 면 default값 나옴. 
	}
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		if(stop) {
			this.speed = 0;
		}
	}
}
