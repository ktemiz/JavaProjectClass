package ReplIt_099to129;

import java.util.Scanner;

public class Rep97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	    
	    String out="";
	    
	    for(int i=givenString.length()-1; i>=0; i--) {
	    	
	    	out=out+givenString.charAt(i);
	    	
	    }
	    if(out.equals(givenString)) {
	    	System.out.println("true");
	    }
	    else {
	    	System.out.println("false");
	    }

	}

}
