package ReplIt_99to129;

import java.util.Scanner;

public class Rep99 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    
	    for(int i=0; i<word.length(); i++) {
	    	
	    	char m=word.charAt(i);
	    	
	    	System.out.print(m+" ");
	    }

	}

}
