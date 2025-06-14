package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="(//a[normalize-space(text())='Sign In'])[1]")
	private WebElement signinlink;
	
	@FindBy(xpath="//span[text()='Customer Login']")
	private WebElement Customerlogintext;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement LoginEmail;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement Loginpassword;
	
	@FindBy(xpath = "(//span[text()='Sign In'])[1]")
	private WebElement Signinbutton;
	
	@FindBy(xpath = "//span[text()='Home Page']")
	private WebElement Homepagetext;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSigninlink() {
		return signinlink;
	}
	
	public WebElement getCustomerlogintext() {
		return Customerlogintext;
	}
	
	
	public WebElement getLoginEmail() {
		return LoginEmail;
	}
	
	public WebElement getLoginpassword()
	{
		return Loginpassword;
	}
	public WebElement getSigninbutton()
	{
		return Signinbutton;
	}
	public WebElement getHomepagetext()
	{
		return Homepagetext;
	}

}
