package HomeWorks;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollect {

	public static void main(String[] args) {
		
		Set<String> cities = new LinkedHashSet<>();
		cities.add("Fairfax");
		cities.add("Annandale");
		cities.add("Reston");
		cities.add("Alexandria");
		cities.add("Chantilly");
		
		Iterator<String> it =cities.iterator();
		
		while(it.hasNext()) {
			String obj=it.next().toLowerCase();
			if(obj.startsWith("a")) {
				it.remove();
			}
		}
		System.out.println(cities);
	}

} 
