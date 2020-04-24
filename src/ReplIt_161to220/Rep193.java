package ReplIt_161to220;

 import java.util.*;


 public class Rep193 {
	
 public static void main(String[] args) {
	
	Set<String> values = new LinkedHashSet<>();
	values.add("null");
	values.add("Sohil");
	values.add("Diego");
	values.add("Alijon");
	values.add("Asel");
	values.add("Sumair");
	
	for(String m :values) {
		System.out.println(m);
	}
	
	Iterator<String> it = values.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
			
 
 
 }
 }
	
