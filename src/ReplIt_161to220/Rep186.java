package ReplIt_161to220;

import java.util.*;

public class Rep186 {

	public static void main(String[] args) {

		LinkedList<Integer> prime = new LinkedList<>();
		
		for (int i = 2; i <= 100; i++) {
			prime.add(i);
		}

		for (int a = 2; a <= 100; a++) {
			for (int j = 2; j < a; j++) {
				if (a % j == 0) {
					prime.remove((Integer) a);
					break;
				}

			}
		}
		System.out.println(prime);
	}
}