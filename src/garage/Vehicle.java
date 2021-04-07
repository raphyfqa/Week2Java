package garage;

public class Vehicle {
	
	private int numberOfWheels;
	private int topSpeed;
	private int mileage;
	
	public Vehicle() {}
	
	public Vehicle(int numberOfWheels, int topSpeed, int mileage) {
		this.numberOfWheels = numberOfWheels;
		this.topSpeed = topSpeed;
		this.mileage = mileage;
	}
	
	public void moving(){
        System.out.println("I am moving.");
    }
	
	
	// getters and setters
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}
