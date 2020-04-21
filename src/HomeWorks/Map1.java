package HomeWorks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> bestBuy = new HashMap<>();	
		bestBuy.put("Computer", 12344);
		bestBuy.put("iphone", 123213);
		
		Set<Entry<String, Integer>> buy = bestBuy.entrySet();
		
		for(Entry<String,Integer> m:buy) {
			System.out.println(m);
		}
		
		Iterator<Entry<String,Integer>> it =buy.iterator();
		while(it.hasNext()) {
			Entry k = it.next();
		System.out.println(k.getKey()+ " "+ k.getValue());
		
		}
;	
	}
}
