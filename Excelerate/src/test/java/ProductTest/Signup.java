package ProductTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM.Createaccount;
import genericrepository.BasicConfiguration;

public class Signup extends BasicConfiguration {
	@Test
	public void signup(){
		
		//create referrence variable for createaccount which is present in POM 
		Createaccount a=new Createaccount(driver);
		
		//With help of the Reference variable calling the createacccount link and clicking on that link by calling click method
		 a.getCreateaccountlink().click();
		 
		 //Verrifying the createAccount page is displayed
		 WebElement text=a.getCreateaccounttext();
		 System.out.println(text);
		if(text.isDisplayed())
		{
			//Entering the First Name in First Name textfield which is taken from Excel
			String FirstName=excelfilelibrary.readData("Createaccountdetails", 1, 0);
			a.getFirstName().sendKeys(FirstName);
			
			//Entering the Last Name textfield which is taken from Excel
			String LastName=excelfilelibrary.readData("Createaccountdetails", 1, 1);
			a.getLastName().sendKeys(LastName);
			
			//Handling the Interrupted Exception
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	 //Entering the Existing-email in email textfield and taking the input from Excelfile
			String Email=excelfilelibrary.readData("Createaccountdetails", 1, 2);
			a.getEmail().sendKeys(Email);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Entering the password in password textfield and taking the input from Excelfile
			String Password=excelfilelibrary.readData("Createaccountdetails", 1, 3);
			a.getPassword().sendKeys(Password);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//Entering the Confirm Password
			String ConfirmPassword=excelfilelibrary.readData("Createaccountdetails", 1, 4);
			a.getConfirmPassword().sendKeys(ConfirmPassword);
			 //Click on Createaccouunt button
			a.getCreateaccountbutton().click();
			
			
		}
		
	}
	
	
		
}
