package ReplIt_161to220;

import javax.management.RuntimeErrorException;

public class Rep209 {

	public static void main(String[] args) {
		
		try {
		tempMethod(30);
		}
		catch(Exception m) {
			System.out.println(m);
		}

	}
	
	public static void tempMethod(int temp) {
		
		if (temp<32) {
			
			throw new RuntimeException("It is freezing");
		}else {
			System.out.println("great weather");
		}
	}

}
