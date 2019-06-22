package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.DolibarrHomePage;
import page.LoginPage;

public class TestValidLogin extends BaseTest
{
@Test(priority=1)
public void testValidLogin()
{

	String un = FWUtil.getXLData(INPUT_PATH, "TestValidLogin", 1, 0);
	String pw = FWUtil.getXLData(INPUT_PATH, "TestValidLogin", 1, 1);
	String eTitle = FWUtil.getXLData(INPUT_PATH, "TestValidLogin", 1, 2);
	LoginPage lv=new LoginPage(driver);
	//Enter valid userName
	lv.setUserName(un);
	// Enter valid password
	lv.setPassWord(pw);
	//click on connection button
	lv.clickOnConnectionButton();
	//verify home page should be displayed
	DolibarrHomePage hp=new DolibarrHomePage(driver);
	hp.verifyHomePageTitle(driver, eTitle, ETO);
}
}
