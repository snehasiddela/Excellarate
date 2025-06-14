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
	
	@FindBy(xpath="(//a[text()='My Account'])[1]")
	private WebElement Myaccountoptions;
	
	
	
	@FindBy(xpath="//a[contains(text(),' Change Password ')]")
	private WebElement changepasswordlink;
	
	@FindBy(xpath="//span[text()='Edit Account Information']")
	private WebElement Editinformationtext;
	
	@FindBy(xpath="//input[@id='current-password']")
	private WebElement currentpassword;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement newpassword;
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//span[text()='Save']")
	private WebElement save;
	@FindBy(xpath="//span[text()=\"My Account\"]")
	private WebElement MyAccount;
	
	
	
	
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
	public WebElement getMyaccountoptions() {
		return Myaccountoptions;
	}
	public WebElement getchangepasswordlink() {
		return changepasswordlink;
	}
	public WebElement getEditinformationtext() {
		return Editinformationtext;
	}
	public WebElement getCurrentpassword() {
		return currentpassword;
	}
	
	public WebElement getNewpassword() {
		return newpassword;
	}
	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getMyAccount() {
		return MyAccount;
	}
	

}
