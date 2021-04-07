package garage;

public class Lorry extends Vehicle {

	private boolean drivesOnLeft;
	
	public Lorry() {}
	
	public Lorry(int numberOfWheels, int topSpeed, int mileage, boolean drivesOnLeft) {
		super(numberOfWheels, topSpeed, mileage);
		this.drivesOnLeft = drivesOnLeft;
	}
	
	public void football(){
        System.out.println("I am picking up my kids from football practice.");
    }

	
	// getters and setters
	public boolean getDrivesOnLeft() {
		return drivesOnLeft;
	}

	public void setDrivesOnLeft(boolean drivesOnLeft) {
		this.drivesOnLeft = drivesOnLeft;
	}
}
