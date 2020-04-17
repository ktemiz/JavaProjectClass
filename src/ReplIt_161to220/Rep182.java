package ReplIt_161to220;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Rep182 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> elementNum = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			int num=scan.nextInt();
			elementNum.add(num);
		}
		
		Iterator<Integer> it = elementNum.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}

	}

}
