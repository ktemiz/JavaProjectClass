package ReplIt_161to220;

import java.util.*;

public class Rep183 {

	
	public static void main(String[] args) {
		

		
		LinkedList<Integer> nums= new LinkedList<>();
		
		
		for (int x = 50; x <100; x++) {
			nums.add(x);
		}


		Iterator <Integer> n = nums.iterator();
		
		while (n.hasNext()) {
			if (!(n.next() % 3 == 0)) {
				n.remove();
			}
		}
		
		System.out.println(nums);
	}

	}

