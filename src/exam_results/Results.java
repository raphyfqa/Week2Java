package exam_results;

public class Results {

	public static int Total(int Biology, int Chemistry, int Physics) {
		
		int total = Biology + Chemistry + Physics;
		return total;
	
	}
	
	public static double Percentage(double number) {
		
		double percentage = number * 100/450;
		return percentage;
	}
	
}
