package HomeWorks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;


public class MapFileProperties {

	public static void main(String[] args) throws IOException {
		
		//to read the file:
		//to have 
		String filePath="/Users/tmzz/eclipse-workspace/JavaBasics/configs/Examples.properties";
		
		//2.bring object of 
		
		FileInputStream fileInput= new FileInputStream(filePath);
		
		//to handle data from properties file we need property class
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		
		Set<Object> keys= prop.keySet();
		for(Object key:keys) {
			System.out.println(key);
		}


	}

}
