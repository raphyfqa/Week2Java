package animals;


public class Runner {

	 public static void main(String[] args){
	       
	        Bear bear = new Bear();
	        bear.climbTree();
	        bear.eat();
	        bear.setAge(15);
	        System.out.println(bear.getAge()); 
	        
	        Eagle eagle = new Eagle();
	        eagle.catchFish();
	        eagle.setNumberOfFeathers(100);
	        System.out.println(eagle.getNumberOfFeathers());
	        
	        Shark shark = new Shark();
	        shark.swimming();
	        shark.huntingHuman();
	        shark.setKnowsNemo(false);
	        shark.nemo();

	 }
}
