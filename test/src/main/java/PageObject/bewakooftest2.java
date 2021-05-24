package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bewakooftest2 {
	
	public WebDriver driver;
	
    
	private By Click_On_Loginpage = By.id("loginLink");
	private By Click_On_Email = By.id("web_email_login");
	private By Click_On_EmailInput = By.xpath("//input[@name='email']");
	private By Click_On_Password = By.xpath("//input[@name='password']");
	private By Click_On_Login = By.xpath("//button[@type='submit']");
	
	public bewakooftest2(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getClick_On_Loginpage() {
		return driver.findElement(Click_On_Loginpage);
	}
	public WebElement getClick_On_Email() {
		return driver.findElement(Click_On_Email);
	}
	public WebElement getClick_On_EmailInput() {
		return driver.findElement(Click_On_EmailInput);
	}
	public WebElement getClick_On_Password() {
		return driver.findElement(Click_On_Password);
	}
	public WebElement getClick_On_Login() {
		return driver.findElement(Click_On_Login);
	}

}
