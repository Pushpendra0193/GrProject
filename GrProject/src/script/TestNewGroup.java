package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.DolibarrHomePage;
import page.GroupCardPage;
import page.LoginPage;

public class TestNewGroup extends BaseTest
{

	@Test(priority=4)
	public void testNewGroup()
	{
		String un = FWUtil.getXLData(INPUT_PATH, "testNewGroup", 1, 0);
		String pw = FWUtil.getXLData(INPUT_PATH, "testNewGroup", 1, 1);
		String eTitle = FWUtil.getXLData(INPUT_PATH, "testNewGroup", 1, 2);
		String gn = FWUtil.getXLData(INPUT_PATH, "testNewGroup", 1, 3);
		String gnote = FWUtil.getXLData(INPUT_PATH, "testNewGroup", 1, 4);
		String eText = FWUtil.getXLData(INPUT_PATH, "testNewGroup", 1, 5);
		String username = FWUtil.getXLData(INPUT_PATH, "testNewGroup", 1,6);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(un);
		lp.setPassWord(pw);
		lp.clickOnConnectionButton();
		DolibarrHomePage hp=new DolibarrHomePage(driver);
		hp.clickUserAndGroup();
		hp.clickNewGroup();
		
		GroupCardPage gc=new GroupCardPage(driver);
		gc.verifyGroupCardPageTitle(driver, eTitle, ETO);
		gc.setGroupName(gn);
		gc.setGroupNote(gnote);
		gc.clickonCreateGroup();
		hp.clickGroup();
		hp.verifyGroupSalesG(eText);
		hp.clickSalesG();
		gc.clickonNonAssUserListBox(username);
		gc.clickonAdd();
		gc.clickOnGroupPerTab();
		
		
		
	}
}
