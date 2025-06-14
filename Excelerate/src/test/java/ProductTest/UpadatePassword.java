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
	//Declaring the Waiting statements for handling the Sychronization Errors
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//Creating the reference variable for LoginPageclass which is present in POM
	LoginPage l=new LoginPage(driver);
	
	//Creating the reference variable for ChangePassword class which is present POM
	ChangePassword change=new ChangePassword(driver);
	
	//Click on Signin link
	l.getSigninlink().click();
	
	//Verifying the signin page is displayed
    WebElement customertext=l.getCustomerlogintext();
     if(customertext.isDisplayed())
     {
    	 
    	 //Entering the Existing-email in email textfield and taking the input from Excelfile
    	 String Email=excelfilelibrary.readData("Createaccountdetails", 1, 2);
			l.getLoginEmail().sendKeys(Email);
			
			//Entering the password in password textfield and taking the input from Excelfile
			String Password=excelfilelibrary.readData("Createaccountdetails", 1, 3);
			l.getLoginpassword().sendKeys(Password);
			
			//Click on signin button
			l.getSigninbutton().click();
			
			//Create a reference variable for signout class which is present in POM
			Signout s=new Signout(driver);
			
			//Click on my account dropdown
			s.getMyaccount().click();
			
			//Select the Myaccountoption
			change.getMyaccountoptions().click();
			
			//Verify that   My Account page is displayed
			WebElement account = change.getMyAccount();
			if(account.isDisplayed()) {
				
				//Click on changepassword
   			 change.getchangepasswordlink().click();
   			 
   			 // Verify that Edit information page is displayed
    		 WebElement infotext=change.getEditinformationtext();
    		 if(infotext.isDisplayed())
    		 {
    			 
    			//Entering the password in confirmpassword textfield and taking the input from Excelfile
    			 String Currentpassword=excelfilelibrary.readData("Createaccountdetails", 1, 3);
    			 change.getCurrentpassword().sendKeys(Currentpassword);
    			 
    			 
    			//Entering the Newpassword in password textfield and taking the input from Excelfile 
    			 String Newpassword=excelfilelibrary.readData("Createaccountdetails", 4, 3);
    			 change.getNewpassword().sendKeys(Newpassword);
    			 
    			//Entering the Confirmpassword in password textfield and taking the input from Excelfile
    			 String Confirmpassword=excelfilelibrary.readData("Createaccountdetails", 5, 3);
    			 change.getConfirmpassword().sendKeys(Confirmpassword);
    			 
    			 change.getSave().click();
    			 
    		 }
     }

}
}
}
