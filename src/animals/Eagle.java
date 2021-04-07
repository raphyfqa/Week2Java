package animals;

public class Eagle extends Animal {

	private int numberOfFeathers;
	private int talonLength;
	
	public void catchFish(){
        System.out.println("I am catching a fish.");
    }
	
	public void makingNest(){
        System.out.println("I am catching a fish.");
    }
	
	
	
	// getters and setters
	public int getNumberOfFeathers() {
		return numberOfFeathers;
	}
	
	public void setNumberOfFeathers(int numberOfFeathers) {
		this.numberOfFeathers = numberOfFeathers;
	}
	
	public int getTalonLength() {
		return talonLength;
	}
	
	public void setTalonLength(int talonLength) {
		this.talonLength = talonLength;
	}
		
}
