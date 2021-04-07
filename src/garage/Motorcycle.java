package garage;

public class Motorcycle extends Vehicle {
	
	private boolean helmetInclusive;
	
	public Motorcycle() {}
	
	public Motorcycle(int numberOfWheels, int topSpeed, int mileage, boolean helmetInclusive) {
		super(numberOfWheels, topSpeed, mileage);
		this.helmetInclusive = helmetInclusive;
	}

	public void cool(){
        System.out.println("I look cool.");
    }
	
	
	// getters and setters
	public boolean getHelmetInclusive() {
		return helmetInclusive;
	}

	public void setHelmetInclusive(boolean helmetInclusive) {
		this.helmetInclusive = helmetInclusive;
	}

}
