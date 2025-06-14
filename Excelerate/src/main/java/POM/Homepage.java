package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//span[text()='Sale']")
	private WebElement homepagetext;
	public 	Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getHomepagetext() {
		return homepagetext;
	}

}
