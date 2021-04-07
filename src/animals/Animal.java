package animals;

public class Animal {
	
	private boolean canFly = true;
	private int numberOfLegs;
	private int age;

    public void eat(){
        System.out.println("I am eating.");
    }
    
    public void sleep(){
        System.out.println("I am sleeping.");
    }
    
    // getters and setters
    public boolean getCanFly(){
        return canFly;
    }

    public void setFly(boolean newValueOfFly){
        this.canFly = newValueOfFly;
    }

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
