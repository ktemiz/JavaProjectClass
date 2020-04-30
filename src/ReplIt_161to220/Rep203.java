package ReplIt_161to220;


import java.util.Map.Entry;
import java.util.*;

public class Rep203 {
public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		Set<Entry<String, String>> entries = map.entrySet();
		
		System.out.println("HashMap Before Replace :");
		Iterator<Entry<String, String>> it = entries.iterator();
		while(it.hasNext()) {
			Entry<String, String> m =it.next();
			String keyEnt = m.getKey();
			String valueEnt = m.getValue();
			System.out.println(keyEnt+" : "+valueEnt);
		}
		
		System.out.println("------------------");
		System.out.println("HashMap After Replace :");
		
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		
		Iterator<Entry<String, String>> it1 = entries.iterator();
		while(it1.hasNext()) {
			
			Entry<String, String> m =it1.next();
			String keyEnt = m.getKey();
			String valueEnt = m.getValue();
			System.out.println(keyEnt+" : "+valueEnt);
		
		}
}
}