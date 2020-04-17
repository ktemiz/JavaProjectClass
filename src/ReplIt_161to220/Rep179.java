package ReplIt_161to220;

import java.util.ArrayList;
import java.util.Iterator;

public class Rep179 {

	public static void main(String[] args) {
		
		ArrayList<Integer> int1 = new ArrayList<>();
		int1.add(111);
		int1.add(111);
		int1.add(111);
		int1.add(999);
		int1.add(999);
		int1.add(999);
		
//		
//		for(int m:int1) {
//			System.out.println(m);
//		}
//		
		Iterator<Integer> t = int1.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
			
		}
	
	}
}
