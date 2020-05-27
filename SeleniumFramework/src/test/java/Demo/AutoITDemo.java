package Demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AutoITDemo {
	
	@Test
	public static void test() throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		
		try {
			driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
			}
			catch(Exception e) {
			  //  Block of code to handle errors
				System.out.println("Something went wrong.");
			}
		
		Runtime.getRuntime().exec("C:\\Code\\FileUploadScript.exe");
		Thread.sleep(3000);
		
		
		driver.close();
	}

}
