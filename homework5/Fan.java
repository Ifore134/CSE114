package homework5;

public class Fan {
	static int SLOW = 1;
	static int MEDIUM = 2;
	static int FAST = 3;
	int speed = SLOW;
	boolean on = false;
	double radius = 5;
	String color = "blue";
	    
	public Fan() {		
	     
	}
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public boolean getOn(){
		return on;
	}
	public void setOn(boolean on){
		this.on = on;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public String toString() {
		if(this.on = true) {
		return"Fan Speed: " + this.speed + "  fan color: " + this.color + "  fan radius: " + this.radius;
		}
		else {
			return "fan is off " + " fan color: " + this.color + "  fan radius: " + this.radius;
		}
	}

}
