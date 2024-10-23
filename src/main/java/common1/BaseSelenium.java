
package common1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import cucumber.api.java.After;
import cucumber.api.java.Before;




public class BaseSelenium {
	
	@DataProvider(name="loginArrayData")
	public String[][] getArrayData()
	{
		String loginData[][]= {
				{"admin","admin123"},
				{"vaibhav","vaibhav123"},
				{"avinash","avinash123"}
		};
		return loginData;
	}
	/*
	@BeforeMethod
	@Before
	public void beforeEachTest()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 WebDriverFactory.setDriver(new ChromeDriver());
		 WebDriverFactory.getDriver().manage().window().maximize();
		 WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterMethod
	@After
	public void AfterEachTest()
	{
		
	//WebDriverFactory.getDriver().quit();
	}
*/
}
