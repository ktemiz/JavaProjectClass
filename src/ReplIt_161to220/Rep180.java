package ReplIt_161to220;

import java.util.ArrayList;

public class Rep180 {

	public static void main(String[] args) {
		
		ArrayList<Integer> int1 = new ArrayList<>();
		int1.add(111);
		int1.add(222);
		int1.add(333);
		int1.add(444);
		int1.add(555);
		int1.add(666);
		
		System.out.println(int1);
		int1.removeAll(int1);
		System.out.println(int1);
}
}
