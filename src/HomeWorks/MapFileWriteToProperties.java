package HomeWorks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class MapFileWriteToProperties {

	public static void main(String[] args) throws IOException {
		
		String filePath="/Users/tmzz/eclipse-workspace/JavaBasics/configs/Examples.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		prop.setProperty("phone", "33434");
		
		FileOutputStream fos = new FileOutputStream(filePath);
		prop.store(fos, "additional data");

	}

}
