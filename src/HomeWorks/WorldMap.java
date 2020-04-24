package HomeWorks;

import java.util.*;
import java.util.Map.Entry;

public class WorldMap {
	
	public static void main(String[] args) {
		
		Map<String, String> europe = new HashMap<>();
		europe.put("France", "Paris");
		europe.put("Italy", "Rome");
		europe.put("Germany", "Berlin");
		System.out.println(europe);
		
		Set<Entry<String, String>> entries = europe.entrySet();
		System.out.println(entries);
		
		Map<String, String> africa = new HashMap<>();
		europe.put("Morocco", "Rabat");
		europe.put("Egypt", "Cairo");
		europe.put("Tunusia", "Tunis");
		
		
		Map<String, String> asia = new HashMap<>();
		europe.put("China", "Beijing");
		europe.put("Japan", "Tokyo");
		europe.put("Turkey", "Ankara");
		
		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(asia);
		world.add(africa);
		
		
		
	}

}
