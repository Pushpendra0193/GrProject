package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UserCardPage
{
@FindBy(xpath="//input[@name='nom']")
private WebElement lnTB;
@FindBy(xpath="//input[@name='prenom']")
private WebElement fnTB;
@FindBy(xpath="//input[@name='job']")
private WebElement pfTB;
@FindBy(xpath="//input[@name='login']")
private WebElement loginTB;
@FindBy(xpath="//input[@name='password']")
private WebElement pwTB;
@FindBy(xpath="//input[@name='office_phone']")
private WebElement ppTB;
@FindBy(xpath="//input[@name='user_mobile']")
private WebElement mbTB;
@FindBy(xpath="//input[@name='office_fax']")
private WebElement faxTB;
@FindBy(xpath="//input[@name='email']")
private WebElement EmailTB;
@FindBy(xpath="//textarea[@name='signature']")
private WebElement sigTA;
@FindBy(xpath="//textarea[@name='note']")
private WebElement noteTA;
@FindBy(xpath="//input[@name='create']")
private WebElement createUserBTN;
public UserCardPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
public void setLastName(String ln)
{
	lnTB.sendKeys(ln);
}
public void setFirstName(String fn)
{
	fnTB.sendKeys(fn);
}
public void setPost(String pf)
{
	pfTB.sendKeys(pf);
}
public void setLogin(String lg)
{
loginTB.sendKeys(lg);	
}
public void setPassword(String pw)
{
pwTB.clear();
pwTB.sendKeys(pw);	
}
public void setProfPhone(String pp)
{
ppTB.sendKeys(pp);	
}
public void setMobNumber(String mn)
{
mbTB.sendKeys(mn);	
}
public void setFax(String fx)
{
faxTB.sendKeys(fx);	
}
public void setEmail(String em)
{
	EmailTB.sendKeys(em);	
}
public void setSignature(String sig)
{
	sigTA.sendKeys(sig);	
}
public void setNote(String nt)
{
	noteTA.sendKeys(nt);	
}
public void clickOnCreateUserbutton()
{
	createUserBTN.click();
}
public void verifyUserCardePageTitle(WebDriver driver,String eTitle,long ETO)
{
	String aTitle = driver.getTitle();
	WebDriverWait wait=new WebDriverWait(driver, ETO);
	wait.until(ExpectedConditions.titleContains(aTitle));
	Assert.assertEquals(aTitle, eTitle);
			
}


}
