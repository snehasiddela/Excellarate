package ProductTest;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.LoginPage;
import genericrepository.BasicConfiguration;

public class Login extends BasicConfiguration{
	
	@Test
	public void userlogin() {
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	LoginPage l=new LoginPage(driver);
	l.getSigninlink().click();
    WebElement ct=l.getCustomerlogintext();
     if(ct.isDisplayed())
     {
    	 String Email=excelfilelibrary.readData("Createaccountdetails", 1, 2);
			l.getLoginEmail().sendKeys(Email);
			
			String Password=excelfilelibrary.readData("Createaccountdetails", 1, 3);
			l.getLoginpassword().sendKeys(Password);
			
			l.getSigninbutton().click();
			WebElement ht=l.getHomepagetext();
			if(ht.isDisplayed()) {
				Reporter.log("Login successful",true);
			}
			}
     }
	}
