package DemoAppForAzure.AzureApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
	@Test
	public void testAppForWeb() {
		
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		
		driver.quit();
	
	}
	
}