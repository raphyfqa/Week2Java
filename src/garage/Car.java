package garage;

public class Car extends Vehicle {

	private int numberOfSeats;
	
	public Car() {}
	
	public Car(int numberOfWheels, int topSpeed, int mileage, int numberOfSeats) {
		super(numberOfWheels, topSpeed, mileage);
		this.numberOfSeats = numberOfSeats;
	}

	public void football(){
        System.out.println("I am picking up my kids from football practice.");
    }
	
	// getters and setters
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	
}
