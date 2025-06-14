package ProductTest;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.Homepage;
import POM.Signout;
import genericrepository.BasicConfiguration;

public class Logout extends BasicConfiguration{
	
	@Test
	public void userLogout()
	{
		
		//Handling the Sychronization Errors by giving selenium Timeouts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Creating Reference variable for signout which is present in POM
		Signout s=new Signout(driver);
		
		//Click on Signin link
		s.getSigninlink1().click();
		
		//Verifying the Signin page is displayed
		WebElement loginpagetext=s.getCustomerLogin();
		if(loginpagetext.isDisplayed())
		{
			
	    	 //Entering the Existing-email in email textfield and taking the input from Excelfile
			String Email=excelfilelibrary.readData("Createaccountdetails", 1, 2);
			s.getLoginEmail1().sendKeys(Email);
			
			//Entering the Password in password textfield and taking the input from Excelfile
			String Password=excelfilelibrary.readData("Createaccountdetails", 1, 3);
			s.getLoginPassword1().sendKeys(Password);
			
			//Click on Signin button
			s.getsignin1().click();
			
			//Verify that homepage is displayed
			WebElement homepagetext=s.getHomepagetext1();
			if(homepagetext.isDisplayed())
			{
				//Click on My account dropdown
				s.getMyaccount().click();
				//Select the signout dropdown
				s.getSignout().click();
				//Verifying the Homepage is displayed
				Homepage home=new Homepage(driver);		
				WebElement homepage=home.getHomepagetext();
				if( homepage.isDisplayed())
			 {
				Reporter.log("Signout Successful",true);
			}
			}
			
			
		}
		
	}
	

}
