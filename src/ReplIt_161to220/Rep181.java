package ReplIt_161to220;


import java.util.ArrayList;
import java.util.Iterator;

public class Rep181 {
	
	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<>();
		str.add("hi");
		str.add("yo");
		str.add("sup");
		str.add("yolo");
		str.add("boop");
		
		String e1=str.get(0);
		String e3=str.get(2);
		String e5=str.get(4);
		
		Iterator<String> it = str.iterator();
			
		while(it.hasNext()) {
			String out =it.next();
			if(out.equals(e1) || out.equals(e3) || out.equals(e5) ) {
				it.remove();
			}	
	}
		for(String m:str) {
			System.out.print(m+" ");
		}

}
}
