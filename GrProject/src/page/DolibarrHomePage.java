package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DolibarrHomePage
{
	@FindBy(linkText="Users & Groups")
	private WebElement userGroupLink;
	
	@FindBy(linkText="New user")
	private WebElement newUserLink;
	
	@FindBy(linkText="New group")
	private WebElement newGroupLink;
	
	@FindBy(linkText="Users")
	private WebElement usersLink;
	
	@FindBy(xpath="//a[text()=' @pushpendra']")
	private WebElement aman;
	
	@FindBy(xpath="//a[text()='Groups']")
	private WebElement groupLink;
	
	@FindBy(xpath="//a[text()=' SalesGr']")
	private WebElement salesG;
	
public DolibarrHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void verifyHomePageTitle(WebDriver driver,String eTitle,long ETO)
{
	String aTitle = driver.getTitle();
	WebDriverWait wait=new WebDriverWait(driver, ETO);
	wait.until(ExpectedConditions.titleContains(aTitle));
	Assert.assertEquals(aTitle, eTitle);
			
}

public void clickUserAndGroup()
{
   userGroupLink.click();	
}
public void clickNewUser()
{
newUserLink.click();
}

public void clickNewGroup()
{
	newGroupLink.click();
}
public void clickUsers()
{
usersLink.click();	
}
public void clickGroup()
{
	groupLink.click();	
}
public void verifyUserAman(String eText)
{
	String aText = aman.getText();
	Assert.assertEquals(aText, eText);
}
public void verifyGroupSalesG(String eText)
{
	String aText = salesG.getText();
	Assert.assertEquals(aText, eText);
}
public void clickSalesG()
{
salesG.click();	
}

}
