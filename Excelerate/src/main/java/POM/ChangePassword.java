package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {
	
	@FindBy(id="email")
	private WebElement LoginEmail2;
	
	@FindBy(xpath="(//input[@id='pass'])[1]")
	private WebElement Password2;
	
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	private WebElement Signin3;
	
	@FindBy(xpath="(//ul[@class='header links'])[1]")
	private WebElement Myaccount1;
	
	public 	ChangePassword(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getLoginEmail2() {
		return LoginEmail2;
	}
	public WebElement getPassword2() {
		return Password2;
	}
	public WebElement getSignin3() {
		return Signin3;
	}
	public WebElement getMyaccount1() {
		return Myaccount1;
	}
	

}
