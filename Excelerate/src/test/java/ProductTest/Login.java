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
	
	//Declaring the Waiting statements for handling the Sychronization Errors
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	 //Create Reference variable for LoginPage which is present in POM
	LoginPage l=new LoginPage(driver);
	
	//Click on Signin link
	l.getSigninlink().click();
	
	//Verify the signin page is displayed
    WebElement ct=l.getCustomerlogintext();
     if(ct.isDisplayed())
     {
    	 //Entering the Existing-email in email textfield and taking the input from Excelfile
    	 String Email=excelfilelibrary.readData("Createaccountdetails", 1, 2);
			l.getLoginEmail().sendKeys(Email);
			
			//Entering the Password in password textfield and taking the input from Excelfile
			String Password=excelfilelibrary.readData("Createaccountdetails", 1, 3);
			l.getLoginpassword().sendKeys(Password);
			
			//Click on signin button
			l.getSigninbutton().click();
			
			//Verifying user is Login to account
			WebElement ht=l.getHomepagetext();
			if(ht.isDisplayed()) {
				Reporter.log("Login successful",true);
			}
			}
     }
	}
