package ReplIt_161to220;

import java.util.*;

public class Rep188 {
	
		public static void main(String[] args) {

			List<String> countries = new LinkedList<>();
			countries.add("Armenia");
			countries.add("USA");
			countries.add("Kazakhstan");
			countries.add("Australia");
			countries.add("Pakistan");
			countries.add("Russia");
			countries.add("Azerbaijan");
			

			Iterator<String> it = countries.iterator();
			
			while(it.hasNext()) {
				if(it.next().toLowerCase().startsWith("a")) {
					it.remove();
				}
			}
			System.out.println(countries);
		}
		
		
	

}
