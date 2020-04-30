package HomeWorks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileBrowser {
	
		public static void main(String[] args) throws IOException {
			
			String filePath="/Users/tmzz/eclipse-workspace/JavaBasics/configs/ChromeBrow.properties";
			
			FileInputStream fileIn = new FileInputStream(filePath);
			
			Properties prop = new Properties();
			prop.load(fileIn);
			
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
			String url = prop.getProperty("url");
			System.out.println(url);
		
	}

}
