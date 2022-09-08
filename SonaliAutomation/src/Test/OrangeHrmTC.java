package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import OrangeHRM.OrangeHrmLogin;

public class OrangeHrmTC 
{

@Test
public void sonaone() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Documents\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	  OrangeHrmLogin gui = new OrangeHrmLogin(driver);
	
}
}
