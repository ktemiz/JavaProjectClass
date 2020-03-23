package HomeWorks;
import java.util.Scanner;

public class ExampleFor {

	public static void main(String[] args) {
		
		
		Scanner input;
		double pay = 0;
		double over = 0;
		
		System.out.println("Please pay $2");
		
		
		while(pay <= 2) {
			
			input = new Scanner(System.in);
			pay = input.nextDouble();
			pay = 2 - pay;
			
			System.out.println("Please pay more amount : "+ pay);
			
		}
		over = pay - 2;
		System.out.println("please do npt forget your money over : "+ over);
	


	}

}
