package ReplIt_161to220;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Rep208 {
	
	public static void main(String[] args) throws FileNotFoundException {
		try{
			method("");
			
		}catch (FileNotFoundException e) {
		System.out.println(e);
		//System.out.println(e.getMessage());
	    //e.printStackTrace();
		}
}
	
	public static void method(String filePath) throws FileNotFoundException{
	
    FileInputStream fis= new FileInputStream(filePath);
	
	
	}
	
	

}
