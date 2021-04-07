package garage;

public class Runner {

	public static void main(String[] args) {

		Garage garage = new Garage();
		Car car1 = new Car();
		Motorcycle motorcycle1 = new Motorcycle();
		Lorry lorry1 = new Lorry();
		Car car2 = new Car();
		Motorcycle motorcycle2 = new Motorcycle();
		Lorry lorry2 = new Lorry();
		garage.addVehicle(car1);
		garage.addVehicle(motorcycle1);
		garage.addVehicle(lorry1);
		garage.addVehicle(car2);
		garage.addVehicle(motorcycle2);
		garage.addVehicle(lorry2);
		garage.billPrice();
		garage.billPrice();
		garage.emptyGarage();
		garage.billPrice();
		
		
		
	}

}
