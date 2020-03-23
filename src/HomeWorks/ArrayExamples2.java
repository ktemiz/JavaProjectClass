package HomeWorks;
import java.util.Scanner;

public class ArrayExamples2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] week = new String[7];
		for(int i = 0; i<=6; i++) {
			
			int j = i+1;
			
			System.out.println("Please enter day "+ j +" of the week");
			
			String days = scan.nextLine();
		
			week[i]= days;
		}
		
		for(int j = 0; j<=6; j++) {
			System.out.println(week[j]);
		}
	
	}

}
