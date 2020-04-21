package ReplIt_161to220;

import java.util.*;

public class Rep184 {

	
		
		public static void main(String[] args) {
			
			LinkedList<Integer> fibo = new LinkedList<>();
			
			fibo.add(0, 0);
			fibo.add(1, 1);
			
			int sum;
			for(int i=2; i<10; i++) {
				sum=fibo.get(i-1)+fibo.get(i-2);
				fibo.add(sum);
			}
			System.out.println(fibo);
		}
	}

