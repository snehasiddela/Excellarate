package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout {
 
	
	@FindBy(id="email")
	private WebElement LoginEmail1;
	
	@FindBy(xpath="(//input[@id='pass'])[1]")
	private WebElement LoginPassword1;
	
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	private WebElement signin1;
	
	@FindBy(xpath="(//ul[@class='header links'])[1]")
	private WebElement Myaccount;
	
	@FindBy(xpath="(//a[normalize-space(text())='Sign Out'])[1]")
	private WebElement Signout;
	
	public Signout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getLoginEmail1() {
		return LoginEmail1;
	}
	public WebElement getLoginPassword1()
	{
		return LoginPassword1;
	}
	public  WebElement getsignin1() {
		return signin1;
	}
	
	public WebElement getMyaccount() {
		return Myaccount;
	}
	public WebElement getSignout() {
		return Signout;
	}
	
}
