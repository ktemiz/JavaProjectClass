package ReplIt_161to220;

import java.util.*;

public class Rep186{

public static void main (String[] args)
{		
    int i =0;
    int num =0;
    //Empty String
    int  primeNumbers =0;

    for (i = 1; i <= 100; i++)         
    { 		  	  
       int counter=0; 	  
       for(num =i; num>=1; num--)
	  {
          if(i%num==0)
	     {
		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	    primeNumbers=i;
	  }	
    }	
    System.out.println("Prime numbers from 1 to 100 are :");
    System.out.println(primeNumbers);
}
}