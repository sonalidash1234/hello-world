package ActitimeLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeMgh 
{
@FindBy(className="placeholder")
private WebElement sonali;

@FindBy(xpath="//input[@id=\"origin\"]")
private WebElement suvam;

@FindBy(xpath="/html/body/div[1]/div[3]/section/div[3]/button")
private WebElement dunna;

public ActitimeMgh(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
public void login() 
{
sonali.click();
suvam.click();
suvam.sendKeys("bangalore");
dunna.click();	
}
}
