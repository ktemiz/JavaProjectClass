package HomeWorks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

		public static void main(String[] args) {
			
			Map<Integer, String> phoneBook = new HashMap<>();
			phoneBook.put(13232, "BMW");
			phoneBook.put(23232, "Ahmet");
			phoneBook.put(43232, "Mary");
			phoneBook.put(43232, "Mehme");
			phoneBook.put(43232, "John");
			
			
			
			//for(Map.Entry<Integer, String> entryData:cars.) {
				
			
			Set<Integer> keys = phoneBook.keySet();
			Iterator<Integer> it =keys.iterator();
			while(it.hasNext()) {
				Integer key = it.next();
				String value = phoneBook.get(key);
				System.out.println(key + " __ "+ value);
						
						
			Collection<String> values =phoneBook.values();
			for(String value1:values) {
				System.out.println(value);
			}
			
			
			Set<Entry<Integer, String>> entries = phoneBook.entrySet();
			
			for(Entry<Integer, String> entry: entries) {
				System.out.println(entry);
				
				Integer key1 = entry.getKey();
				String value1 = entry.getValue();
			}
				
				
			}
			
		
		
		}
			
		}
	
	

