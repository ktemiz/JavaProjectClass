package ReplIt_161to220;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Rep199 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		map.put("mango", 40); 
		map.put("mango", 40);  
		
		Set<Entry<String, Integer>> fruits = map.entrySet();
		
		Iterator<Entry<String, Integer>> it = fruits.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> m = it.next();
			String keyEnt = m.getKey();
			Integer valueEnt = m.getValue();
			System.out.println("Key = "+keyEnt+" and value = "+valueEnt);
		}
		
	}

}
