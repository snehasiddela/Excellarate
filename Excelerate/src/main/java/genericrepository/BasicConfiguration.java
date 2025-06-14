package genericrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import excefilelutility.ReadExcelFile;
import propertyfileutility.ReadPropertyFile;

public class BasicConfiguration {

	public WebDriver driver;

	public ReadExcelFile excelfilelibrary;
	public ReadPropertyFile propertyfilelibrary;

//	@Parameters({"browser","username"})

	@BeforeClass
	public void browserSetup() {

		String bname = "chrome";
		
		// create Object for all library'
		createObject();
		
		// step:1 Launch the browser
		if (bname.equals("chrome")) {

			driver = new ChromeDriver();

		}

		else if (bname.equals("edge")) {

			driver = new EdgeDriver();

		}

		else if (bname.equals("firefox")) {

			driver = new FirefoxDriver();

		}

		// fetch the Url data from property=file
		String URL = propertyfilelibrary.ReadData("url");

		// step2:maximize the browser
		driver.manage().window().maximize();

		// step3:Navigate to the application via URL
		driver.get(URL);

		
	}

	public void createObject() {

		excelfilelibrary = new ReadExcelFile();
		propertyfilelibrary = new ReadPropertyFile();

	}

	@AfterClass
	public void closebrowser() {
		//driver.quit();
		Reporter.log("Closebrowser Successfully", true);

	}

}
