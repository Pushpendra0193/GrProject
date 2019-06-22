package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GroupCardPage
{
@FindBy(xpath="//input[@name='nom']")
private WebElement grNameTB;

@FindBy(xpath="//textarea[@id='note']")
private WebElement grNoteTA;

@FindBy(xpath="//input[@class='button']")
private WebElement creategroupBTN;

@FindBy(xpath="//select[@id='user']")
private WebElement nonAssUserDrDown;
@FindBy(xpath="//a[@id='rights']")
private WebElement groupPerTab;

@FindBy(xpath="//input[@type='submit']")
private WebElement addBTN;
public GroupCardPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void setGroupName(String gname)
{
	grNameTB.sendKeys(gname);
}

public void setGroupNote(String gnote)
{
	grNoteTA.sendKeys(gnote);
}
public void clickonCreateGroup()
{
	creategroupBTN.click();	
}
public void verifyGroupCardPageTitle(WebDriver driver,String eTitle,long ETO)
{
	String aTitle = driver.getTitle();
	WebDriverWait wait=new WebDriverWait(driver, ETO);
	wait.until(ExpectedConditions.titleContains(aTitle));
	Assert.assertEquals(aTitle, eTitle);
			
}

public void clickonNonAssUserListBox(String username)
{
	nonAssUserDrDown.click();
	
	Select select=new Select(nonAssUserDrDown);
	
	select.selectByVisibleText(username);
}

public void clickOnGroupPerTab()
{
groupPerTab.click();	
}

public void clickonAdd()
{	
addBTN.click();
}
}
