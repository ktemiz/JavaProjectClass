package ReplIt_161to220;

import java.util.*;
import java.util.Map.Entry;

public class Rep196 {

	public static void main(String[] args) {
		
		Map<String, String> address = new HashMap<>();
		address.put("Street","Patrick ST");
		address.put("Suite","265");
		address.put("City","Vienna");
		address.put("Zip","22180");
		address.put("Country","Inited State");
		
		System.out.println(address.size());
		
		Set<Entry<String, String>> entries = address.entrySet();
		

		Iterator<Entry<String, String>> it = entries.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println(address.size());
	}
		
	}
