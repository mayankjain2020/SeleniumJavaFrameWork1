package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.TestNGDemo;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getProperties();
		setPrpperties();
		getProperties();
	}
	
	public static void getProperties() {
		
		try {
			
			InputStream input = new FileInputStream(projectPath+"/src/test/java/Config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNGDemo.browserName=browser;
			
		} catch (Exception exp) {
			System.out.println("Message is : "+exp.getMessage());
			System.out.println("Cause is : "+exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	public static void setPrpperties() {
		try {
		OutputStream output = new FileOutputStream(projectPath+"/src/test/java/Config/config.properties");
		prop.setProperty("result", "pass");
		prop.store(output, null);
	
		} catch (Exception exp) {
			System.out.println("Message is : "+exp.getMessage());
			System.out.println("Cause is : "+exp.getCause());
			exp.printStackTrace();
		}
	}

}
