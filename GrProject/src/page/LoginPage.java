package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(id="password")
	private WebElement pwTB;
	
	@FindBy(xpath="//input[@class='button']")
	private WebElement connectionBTN;
	@FindBy(xpath="//div[@class='error']")
	private WebElement errorMSG;
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassWord(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickOnConnectionButton()
	{
		connectionBTN.click();
	}
	
	public void isErrorMsgDisplay()
	{
		
		Assert.assertTrue(errorMSG.isDisplayed());
	
	}
	
	
	
	

}
