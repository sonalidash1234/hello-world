package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLogin
{

	@FindBy(xpath="//input[@name='username']")
	private WebElement gu;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement nu;
	
	@FindBy(className="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
	private WebElement mu;
	
	@FindBy(className="oxd-button oxd-button--medium oxd-button--secondary")
	private WebElement tu;
	
	
	public OrangeHrmLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void login()
	{
		gu.sendKeys("Admin");
		nu.sendKeys("admin123");
		mu.click();
		tu.click();
	}
	
}
