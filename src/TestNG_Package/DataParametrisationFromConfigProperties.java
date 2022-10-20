package TestNG_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataParametrisationFromConfigProperties {
	
	public void takeDataFromPropertyFile() throws FileNotFoundException, IOException {
		
		Properties prop=new Properties();
		
		prop.load(new FileInputStream("./config.properties"));
		
		String url= prop.getProperty("url");
		
		System.out.println(url);
		
		System.out.println(prop.getProperty("username"));
		
		System.out.println(prop.getProperty("password"));
		
	}

}
