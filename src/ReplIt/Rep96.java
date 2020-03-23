package ReplIt;

import java.util.Scanner;

public class Rep96 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    
	    String out="";
	    
	    for(int i=s.length()-1; i>=0; i--) {
	    	
	    	out=out+s.charAt(i);
	    	
	    }
	    System.out.print(out);

	}

}
