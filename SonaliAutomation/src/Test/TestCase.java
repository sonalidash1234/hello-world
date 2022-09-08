package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ActitimeLogin.ActitimeMgh;



public class TestCase	 
{

	
@Test
public void dunnaone() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Documents\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https://www.zoomcar.com/in/bangalore");
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	  ActitimeMgh tui = new ActitimeMgh(driver);
	  
		tui.login();	
	//	driver.close();
//		tui.logout();
}
}
