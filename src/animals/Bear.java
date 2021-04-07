package animals;

public class Bear extends Animal {
	
	private boolean likesHoney;
	private int furLength;
	
	public void hibernate(){
        System.out.println("I am hibernating.");
    }
	
	public void climbTree(){
        System.out.println("I am climbing a tree.");
    }
	
	
	
	// getters and setters
	public boolean getLikesHoney() {
		return likesHoney;
	}

	public void setLikesHoney(boolean likesHoney) {
		this.likesHoney = likesHoney;
	}

	public int getFurLength() {
		return furLength;
	}

	public void setFurLength(int furLength) {
		this.furLength = furLength;
	}
	
}
