package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bewakooftest1 {
	
	public WebDriver driver;
	
	private By Click_On_Catagory = By.linkText("Women");
	
	private By Click_On_Login = By.id("loginLink");
	

	public bewakooftest1(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getClick_On_Catagory() {
	return driver.findElement(Click_On_Catagory);
	}
	
	public WebElement getClick_On_Login() {
		return driver.findElement(Click_On_Login);
	}

}
