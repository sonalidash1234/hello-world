import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
	//	driver.getWindowHandles();
	//	driver.manage().deleteAllCookies();
		System.out.println(driver.getPageSource());
		driver.quit();
	}
}