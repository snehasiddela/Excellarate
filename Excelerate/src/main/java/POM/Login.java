package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement LoginEmail;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement Loginpassword;
	
	@FindBy(xpath = "(//span[text()='Sign In'])[1]")
	private WebElement Signinbutton;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
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

}
