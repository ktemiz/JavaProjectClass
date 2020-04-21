package ReplIt_161to220;

import java.util.*;

public class Rep185 {

	public static void main(String[] args) {
		
		List<Boolean> listA = new ArrayList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		List<Boolean> listB = new ArrayList<>(listA);
		
		Iterator<Boolean> it = listB.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
}
	
}
