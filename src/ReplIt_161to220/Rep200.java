package ReplIt_161to220;
import java.util.*;
import java.util.Map.Entry;
public class Rep200 {
public static void main(String[] args) {
		
		Map<String, String> address = new LinkedHashMap<>();
		address.put("Street","Patrick ST");
		address.put("Suite","265");
		address.put("City","Vienna");
		address.put("Zip","22180");
		address.put("Country","United State");
		
		Set<Entry<String,String>> entries = address.entrySet();
		
		for(Entry<String, String> m:entries) {
			System.out.println(m.getValue());
		}
	}

}
