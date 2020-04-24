package ReplIt_161to220;
import java.util.*;
import java.util.Map.Entry;

public class Rep198 {
	
	public static void main(String[] args) {
		
		Map<String, String> fruits = new TreeMap<>();
		fruits.put("1 item", "apple");
		fruits.put("2 item", "banana");
		fruits.put("3 item", "pear");
		fruits.put("4 item", "tomato");
		fruits.put("5 item", "mango");
		fruits.put("6 item", "kiwi");
		
		Set<Entry<String, String>> entries = fruits.entrySet();
		
		Iterator<Entry<String, String>> it = entries.iterator();
		while(it.hasNext()) {
			Entry<String, String> k =it.next();
			String keyEnt = k.getKey();
			String valueEnt = k.getValue();
			System.out.println("Key is "+keyEnt+" and values is "+valueEnt);
		}
		
		
	}

}
