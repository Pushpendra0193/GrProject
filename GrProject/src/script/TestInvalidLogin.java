package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.DolibarrHomePage;
import page.LoginPage;

public class TestInvalidLogin extends BaseTest
{
@Test(priority=2)
public void testValidLogin()
{

	String un = FWUtil.getXLData(INPUT_PATH, "TestInvalidLogin", 1, 0);
	String pw = FWUtil.getXLData(INPUT_PATH, "TestInvalidLogin", 1, 1);
	LoginPage lv=new LoginPage(driver);
	//Enter valid userName
	lv.setUserName(un);
	// Enter valid password
	lv.setPassWord(pw);
	//click on connection button
	lv.clickOnConnectionButton();
	//verify error message  should be displayed
	lv.isErrorMsgDisplay();
	
}
}
