import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZooomCar
{
			public static void main(String[] args) throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONALI\\Documents\\chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.zoomcar.com/in/bangalore");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
				
				driver.findElement(By.className("placeholder")).click();
				WebElement sona=driver.findElement(By.xpath("//input[@id=\"origin\"]"));
				sona.click();
				sona.sendKeys("bangalore");
//				Thread.sleep(50000);
//				driver.findElement(By.className("button-primaryconfirm-loc-btn")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/section/div[3]/button")).click();
				System.out.println("sonali");
		
				driver.close();
			}

	}


