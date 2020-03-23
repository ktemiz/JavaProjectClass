package ReplIt;

import java.util.Scanner;

public class Rep98 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    
	    String out="";
	
	    	for(int i=1; i<word.length(); i++) {
	    		
	    		if(word.charAt(i)!=word.charAt(i-1)) {
	    	    	
		    		out = out+word.charAt(i);
		    
	    		}
	    		else {
	    			continue;
	    		}
	   	
	}
	    	System.out.println(word.charAt(0)+out);
}
}
	  
	    	
	    	
	    	
	    	
	    	
	    	
	     
	    	