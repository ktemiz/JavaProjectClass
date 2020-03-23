package HomeWorks;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int x = 1;
	
		while (x<=3) {
			
			System.out.println("Do you have credit card?");
			
			boolean answer = scan.nextBoolean();
			
			if (answer) {
				System.out.println("Thank you for your time");
				break;
			}
			x++;
			
		}
		

	}

} 
