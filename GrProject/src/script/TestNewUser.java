package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;
import page.DolibarrHomePage;
import page.LoginPage;
import page.UserCardPage;

public class TestNewUser extends BaseTest
{
@Test(priority=3)
public void testNewUser()
{
String un = FWUtil.getXLData(INPUT_PATH, "TestNewUser", 1, 0);
String pw = FWUtil.getXLData(INPUT_PATH, "TestNewUser", 1, 1);
String eTitle = FWUtil.getXLData(INPUT_PATH, "TestNewUser", 1, 2);
String eText = FWUtil.getXLData(INPUT_PATH, "TestNewUser", 1, 14);
LoginPage l=new LoginPage(driver);
//Enter the user name
l.setUserName(un);
//Enter password
l.setPassWord(pw);
//click on connection
l.clickOnConnectionButton();
DolibarrHomePage hp=new DolibarrHomePage(driver);
//click on user and group in left side
hp.clickUserAndGroup();
//click on new user under User and Group
hp.clickNewUser();

UserCardPage cp=new UserCardPage(driver);
cp.verifyUserCardePageTitle(driver, eTitle, ETO);
for(int i=2;i<=2;i++)
{
	

String lnTB = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 3);
String fnTB = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 4);
String pfTB = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 5);
String loginTB = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 6);
String pwTB = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 7);
String ppTB = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 8);
String mbTB = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 9);
String faxTB = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 10);
String EmailTB = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 11);
String sigTA = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 12);
String noteTA = FWUtil.getXLData(INPUT_PATH, "TestNewUser", i, 13);
//to set the last name
cp.setLastName(lnTB);
//to set the first name
cp.setFirstName(fnTB);
//to set the post/Function
cp.setPost(pfTB);
//to set login
cp.setLogin(loginTB);
//to set passWord
cp.setPassword(pwTB);
//to set prof phone
cp.setProfPhone(ppTB);
//to set mobile number
cp.setMobNumber(mbTB);
//to set fax
cp.setFax(faxTB);
//to set Email
cp.setEmail(EmailTB);
//to set signature
cp.setSignature(sigTA);
//to set note
cp.setNote(noteTA);
//click on create user button
cp.clickOnCreateUserbutton();

}
//click on user under user and group
hp.clickUsers();
hp.verifyUserAman(eText);


}
}
