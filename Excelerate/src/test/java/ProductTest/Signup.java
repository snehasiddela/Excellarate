package ProductTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM.Createaccount;
import genericrepository.BasicConfiguration;

public class Signup extends BasicConfiguration {
	@Test
	public void signup(){
		Createaccount a=new Createaccount(driver);
		 a.getCreateaccountlink().click();
		 WebElement text=a.getCreateaccounttext();
		 System.out.println(text);
		if(text.isDisplayed())
		{
			String FirstName=excelfilelibrary.readData("Createaccountdetails", 1, 0);
			a.getFirstName().sendKeys(FirstName);
			
			String LastName=excelfilelibrary.readData("Createaccountdetails", 1, 1);
			a.getLastName().sendKeys(LastName);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			String Email=excelfilelibrary.readData("Createaccountdetails", 1, 2);
			a.getEmail().sendKeys(Email);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			String Password=excelfilelibrary.readData("Createaccountdetails", 1, 3);
			a.getPassword().sendKeys(Password);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			String ConfirmPassword=excelfilelibrary.readData("Createaccountdetails", 1, 4);
			a.getConfirmPassword().sendKeys(ConfirmPassword);
			 
			a.getCreateaccountbutton().click();
			
			
		}
		
	}
	
	
		
}
