package ReplIt_161to220;

import java.util.*;

public class Rep187 {

	
	public static void main (String[] args) {
	   		
	 List<Integer> obj = new LinkedList<>();
	 obj.add(111);
	 obj.add(222);
	 obj.add(333);
	 obj.add(444);
	 obj.add(555);
	 obj.add(666);
	 
	 Iterator<Integer> it = obj.iterator();
	 
	 int sum=0;
	 while(it.hasNext()) {
		 sum=sum+it.next();
		 
	 }
	 System.out.println("Result of sum is "+sum);
}
}