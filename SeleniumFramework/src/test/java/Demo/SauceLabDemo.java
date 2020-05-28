package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabDemo {

	public static final String USERNAME = "mayankjain2050";
	public static final String ACCESS_KEY = "9f799a5f-2e0b-4caf-813c-8bd87ad69cd4";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Linux");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "GoogleTest1");
		caps.setCapability("extendedDebugging", "true");
		

		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);

		System.out.println(driver.getTitle());

		driver.quit();

		System.out.println("Test Completed");

	}
}


