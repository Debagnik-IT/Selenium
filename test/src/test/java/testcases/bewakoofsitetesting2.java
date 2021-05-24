package testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.bewakooftest2;
import resources.Base;
import utility.ReuseableComponents;

public class bewakoofsitetesting2 extends Base {
	
	public WebDriver driver;
	public static Logger Log=(Logger) LogManager.getLogger(bewakoofsitetesting2.class.getName());
	ReuseableComponents rc = new ReuseableComponents();
	
	@BeforeMethod
	public void beforeMethod() throws IOException
	{
		driver = setupdriver();
		String bewakoofsitetesting2url = rc.getProperty("url");
		driver.get(bewakoofsitetesting2url);
		Log.info("driver setup successfull");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
		Log.info("driver setup closed");
	}
	
	@Test(dataProvider="registerdata")
	public void DefaultTest(String Email, String Password)
	{
		bewakooftest2 c1= new bewakooftest2(driver);
		bewakooftest2 c2= new bewakooftest2(driver);
		bewakooftest2 c3= new bewakooftest2(driver);
		//bewakooftest2 c4= new bewakooftest2(driver);
		c1.getClick_On_Loginpage().click();
		c1.getClick_On_Email().click();
		c2.getClick_On_EmailInput().sendKeys(Email);
		c3.getClick_On_Password().sendKeys(Password);
		//c4.getClick_On_Login().click();
		
		
	}
	
	@DataProvider(name="registerdata")
	public Object[][] getTestData() throws FileNotFoundException, IOException
	{
		return rc.readDataFromExcel(0);
	}

}
