
import java.util.*;

public class QBrating {
	private static double TD;
	private static double yards;
	private static double INT;
	private static double comp;
	private static double ATT;
	
	private static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many touchdowns did the QB collect?");
		double TD = input.nextDouble();
		System.out.println("How many total yards did the QB achieve?");
		double yards = input.nextDouble();
		System.out.println("How many interceptions did the QB have?");
		double INT = input.nextDouble();
		System.out.println("What is the QB's completion?");
		double comp = input.nextDouble();
		System.out.println("How many passes did the QB attempt?");
		double ATT = input.nextDouble();
		input.close();

		double pr_a = (comp/ATT-0.3)*5;
		double pr_b=(yards/ATT-3)*0.25;
		double pr_c=(TD/ATT)*20;
		double pr_d=2.375-(INT/ATT*25);
		double passer_rating=((pr_a+pr_b+pr_c+pr_d)/6)*100;
		{
			System.out.print ("The QB's rating is "+passer_rating);
		}
}
}