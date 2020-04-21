package ReplIt_161to220;

import java.util.*;

public class Rep190 {
	
	public static void main(String[] args) {
		
		Set<String> word =new HashSet<>();
		word.add("third");
		word.add("first");
		word.add("second");
		
		System.out.println(word);
		word.removeAll(word);
		System.out.println(word);
	}

}
