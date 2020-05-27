import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesriedCapabilities_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("ignoreProtectedModeSettings", true);

		//System.out.println("projectPath : "+projectPath);
		
		System.setProperty("webdriver.ie.driver",projectPath+"/Driver/iedriver/IEDriverServer.exe");
		
		WebDriver driver =  new InternetExplorerDriver(caps);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		

	}

}
