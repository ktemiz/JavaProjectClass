package ReplIt_161to220;
import java.util.*;
import java.util.Map.Entry;
public class Rep202 {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("ONE","AAA");
		map.put("TWO","BBB");
		map.put("THREE","CCC");
		map.put("FOUR","DDD");
		map.put("FIVE","EEE");
		
		Set<Entry<String, String>> letters = map.entrySet();
		
		Iterator<Entry<String, String>> it = letters.iterator();
		while(it.hasNext()) {
			Entry<String, String> m = it.next();
			String keyEnt = m.getKey();
			String valueEnt = m.getValue();
			System.out.println(keyEnt+" : "+valueEnt);
			
		}
		System.out.println("-------------");
		
		map.remove("ONE");
		map.remove("FOUR");
		
		Iterator<Entry<String, String>> k = letters.iterator();
		while(k.hasNext()) {
			Entry<String, String> m = k.next();
			String keyEnt = m.getKey();
			String valueEnt = m.getValue();
			System.out.println(keyEnt+" : "+valueEnt);
		}
	}

}
