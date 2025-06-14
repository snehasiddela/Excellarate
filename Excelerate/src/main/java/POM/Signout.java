package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout {
 
	@FindBy(xpath="(//a[normalize-space(text())='Sign In'])[1]")
	private WebElement signinlink1;
	
	@FindBy(xpath="//span[text()='Customer Login']")
	private WebElement CustomerLogin;
	
	@FindBy(id="email")
	private WebElement LoginEmail1;
	
	@FindBy(xpath="(//input[@id='pass'])[1]")
	private WebElement LoginPassword1;
	
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	private WebElement signin1;
	
	@FindBy(xpath = "//span[text()='Home Page']")
	private WebElement Homepagetext1;
	
	@FindBy(xpath="//span[@class='customer-name']/button[@type='button']")
	private WebElement Myaccount;
	
	@FindBy(xpath="(//a[normalize-space(text())='Sign Out'])[1]")
	private WebElement Signout;
	

	
	public Signout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getSigninlink1() {
		return signinlink1;
	}
	public WebElement getCustomerLogin() {
		return CustomerLogin;
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
	public WebElement getHomepagetext1()
	{
		return Homepagetext1;
	}
	
	public WebElement getMyaccount() {
		return Myaccount;
	}
	public WebElement getSignout() {
		return Signout;
	}
	
	
	
}
