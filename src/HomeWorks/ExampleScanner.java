package HomeWorks;
import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Please enter 3 distinct number");
		  
		  int num1 = input.nextInt();
		  int num2 = input.nextInt();
		  int num3 = input.nextInt();
		  
		  if(num1 > num2) {
			  
			  if (num1 > num3) {
				  System.out.println("The largest number is " + num1);
			  }else {
				  System.out.println("The largest number is " + num3);
			  }
			  
		  }else {
			  
			  if (num2 > num3) {
				  System.out.println("The largest number is " + num2);
			  }else {
				  System.out.println("The largest number is " + num3);
			  }
		  }
		  
		  
		  }
         
}

