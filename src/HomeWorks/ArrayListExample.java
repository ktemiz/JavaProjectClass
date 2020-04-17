package HomeWorks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListExample {
	//Retrieve eelement
	public static void main(String[] args) {
	
	LinkedList<String> llist = new LinkedList<>();
	llist.add("Yunus");
	llist.add(0,"Reyhan");
	llist.add("Pavel");
	
	for(String m:llist) {
		System.out.println(m);
	}
	
	Iterator<String> test=llist.iterator();
	
	while(test.hasNext()) {
		String element=test.next();
		System.out.println(element);
	}
	
	
}
}
