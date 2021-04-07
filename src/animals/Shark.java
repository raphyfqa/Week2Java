package animals;

public class Shark {
	
	private int finLength;
	private boolean knowsNemo;
	
	public void huntingHuman(){
        System.out.println("I am hunting a human.");
    }
	
	public void swimming(){
        System.out.println("I am swimming.");
    }
	
	public void nemo() {
		if (getKnowsNemo()) {
			System.out.println("I know Nemo");
		} else {
			System.out.println("Who's Nemo?");
		}
	}
	
	
	
	// getters and setters
	public int getFinLength() {
		return finLength;
	}
	
	public void setFinLength(int finLength) {
		this.finLength = finLength;
	}
	
	public boolean getKnowsNemo() {
		return knowsNemo;
	}
	
	public void setKnowsNemo(boolean knowsNemo) {
		this.knowsNemo = knowsNemo;
	}
	
}
