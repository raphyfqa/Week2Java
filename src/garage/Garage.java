package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	public static void main(String[] args) {}
	
	
	int totalbill = 0;
	List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle newvehicle) {
		this.vehicleList.add(newvehicle);
	}
	
	public void removeVehicleByName(Vehicle vehicleToGo) {
		this.vehicleList.add(vehicleToGo);
	}
	
	public void removeVehicleByIndex(int index) {
		this.vehicleList.remove(index);
	}
	
	public void emptyGarage() {
		this.vehicleList.clear();;
	}
	

	public void billPrice(){
	
		for (Object vehicle : this.vehicleList) {
		    Class<? extends Object> cls = vehicle.getClass();
		    if (cls.getName() == "garage.Car") {
		    	this.totalbill += 50; // each car is worth 50
		    } else if (cls.getName() == "garage.Motorcycle") {
		    	this.totalbill += 30; // each motorcycle is worth 30
		    } else if (cls.getName() == "garage.Lorry") {
		    	this.totalbill += 100; // each lorry is worth 100
		    }
		}
		System.out.println(this.totalbill);
		this.totalbill = 0;
	 }
}
