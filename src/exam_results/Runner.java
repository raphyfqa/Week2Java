package exam_results;


public class Runner {

	public static void main(String[] args) {
		
		int Biology = 112;
		int Chemistry = 56;
		int Physics = 78;
		int total = Results.Total(Biology, Chemistry, Physics);
		String percentage = String.format("%.2f", Results.Percentage(total));
		
		System.out.println("The total result is " + total);
		
		System.out.println("The total percentage is " + percentage + "%");
		
	}
	
}
