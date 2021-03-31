package operators_results;


public class Runner {

	public static void main(String[] args) {
		
		System.out.println("The total result is " + Results.Total(112, 56, 78));
		
		int total = Results.Total(112, 56, 78);
		
		System.out.println("The total percentage is " + String.format("%.2f", Results.Percentage(total)) + "%");
	}
	
}
