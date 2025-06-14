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
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Signout s=new Signout(driver);
		s.getSigninlink1().click();
		WebElement loginpagetext=s.getCustomerLogin();
		if(loginpagetext.isDisplayed())
		{
			String Email=excelfilelibrary.readData("Createaccountdetails", 1, 2);
			s.getLoginEmail1().sendKeys(Email);
			
			String Password=excelfilelibrary.readData("Createaccountdetails", 1, 3);
			s.getLoginPassword1().sendKeys(Password);
			
			s.getsignin1().click();
			WebElement homepagetext=s.getHomepagetext1();
			if(homepagetext.isDisplayed())
			{
				s.getMyaccount().click();
				s.getSignout().click();
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
