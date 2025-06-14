package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createaccount {
        @FindBy(xpath="(//a[text()='Create an Account'])[1]")
        private WebElement Createaccountlink;
        
        @FindBy(xpath="//span[text()='Create New Customer Account']")
        private WebElement Createaccounttext;
        
        @FindBy(id="firstname")
        private WebElement FirstName;
        
        @FindBy(name="lastname")
        private WebElement LastName;
        
        @FindBy(id="email_address")
        private WebElement Email;
        
        @FindBy(xpath = "//input[@id='password']")
        private WebElement password;
        
        @FindBy(id="password-confirmation")
        private WebElement ConfirmPassword;
        
        @FindBy(xpath = "(//span[text()='Create an Account'])[1]")
        private WebElement Createaccountbutton;
        
        public Createaccount(WebDriver driver)
        {
        	PageFactory.initElements(driver, this);
        }
        public WebElement getCreateaccountlink() {
        	return Createaccountlink;
        }
        public WebElement getCreateaccounttext() {
        		return Createaccounttext;
        }
        public WebElement getFirstName()
        {
        	return FirstName;
        }
        public WebElement getLastName()
        {
        	return LastName;
        }
       public WebElement getEmail() {
    	   return Email;
       }
        public WebElement getPassword()
        {
        	return password;
        }
        public WebElement getConfirmPassword() {
        	return ConfirmPassword;
        }
        
        public WebElement getCreateaccountbutton()
        {
        	return Createaccountbutton;
        }
        
        
        
        
        
        
        
        
        
        
        
        
          
          
          
}
