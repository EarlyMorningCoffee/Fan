public class fan {
	public final static int off = 0;
	
	private int speed;
	private String direction;
	
	public fan() {
		this.speed = off;
		this.direction = "Forward";
	}
	
	public int getSpeed() {
        return this.speed;
    }
	
	public String getDirection() {
		return this.direction;
	}
	
	public void setSpeed(int speed) {
        this.speed = speed;
    }
	
	public void setDirection(String direction) {
        this.direction = direction;
    }
	
}