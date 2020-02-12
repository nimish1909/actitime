package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;

	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgnBTN;

	//initialization of pom class
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Action on the elements
	public void setusername(String un)
	{
		unTB.sendKeys(un);
	}
	public void setpassword(String pw)
	{
		pwTB.sendKeys("manager");
	}
	public void clickonlogin()
	{
		lgnBTN.click();
	}
}
