package ProductTest;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM.ChangePassword;
import POM.LoginPage;
import POM.Signout;
import genericrepository.BasicConfiguration;

public class UpadatePassword  extends BasicConfiguration{
	@Test
	public void userchangepassword()
	{	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	LoginPage l=new LoginPage(driver);
	ChangePassword change=new ChangePassword(driver);
	l.getSigninlink().click();
    WebElement customertext=l.getCustomerlogintext();
     if(customertext.isDisplayed())
     {
    	 String Email=excelfilelibrary.readData("Createaccountdetails", 1, 2);
			l.getLoginEmail().sendKeys(Email);
			
			String Password=excelfilelibrary.readData("Createaccountdetails", 1, 3);
			l.getLoginpassword().sendKeys(Password);
			l.getSigninbutton().click();
			Signout s=new Signout(driver);
			s.getMyaccount().click();
			change.getMyaccountoptions().click();
			WebElement account = change.getMyAccount();
			if(account.isDisplayed()) {
   			 change.getchangepasswordlink().click();
    		 WebElement infotext=change.getEditinformationtext();
    		 if(infotext.isDisplayed())
    		 {
    			 String Currentpassword=excelfilelibrary.readData("Createaccountdetails", 1, 3);
    			 change.getCurrentpassword().sendKeys(Currentpassword);
    			 
    			 
    			 
    			 String Newpassword=excelfilelibrary.readData("Createaccountdetails", 4, 3);
    			 change.getNewpassword().sendKeys(Newpassword);
    			 
    			 String Confirmpassword=excelfilelibrary.readData("Createaccountdetails", 5, 3);
    			 change.getConfirmpassword().sendKeys(Confirmpassword);
    			 
    			 change.getSave().click();
    			 
    		 }
     }

}
}
}
