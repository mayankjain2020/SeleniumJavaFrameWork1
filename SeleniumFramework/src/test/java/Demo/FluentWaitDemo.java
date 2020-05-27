package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {
	
	public static void main(String[] args) throws Exception {
		
		test();
		
	}
	
	public static void test() throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Driver/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.linkText("Challenges with IE browser in Selenium Webdriver")).click();
		
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(30,TimeUnit.SECONDS)
			       .pollingEvery(2,TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			      WebElement linkElement =  driver.findElement(By.linkText("Challenges with IE browser in Selenium Webdriver"));
			      if (linkElement.isEnabled()) {
			    	  
			    	  System.out.println("Element found");
			    	  
			      }
			      return linkElement;
			     }
			   });
		
			   
			   element.click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
