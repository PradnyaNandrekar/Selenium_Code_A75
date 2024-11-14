package test_amzn;

import org.testng.Assert;
import org.testng.annotations.Test;

import source_amzn.HomePage;
import source_amzn.Sign_In_Page;
import source_amzn.Sign_In_Password_Page;

// ---------------------------------- Login -------------------------------------------------------------------
public class TestCase01 extends LaunchQuit     
{
	@Test
	public void Login_To_Amazon()
	{
		HomePage HomePage = new HomePage(driver);
		HomePage.Ac_List(driver);
		HomePage.Sign_In();
		Sign_In_Page SingInPage = new Sign_In_Page(driver);
		SingInPage.UserName();
		SingInPage.Continue_Click();
		Sign_In_Password_Page SignInPwPage = new Sign_In_Password_Page(driver);
		SignInPwPage.Enter_Password();
		SignInPwPage.SignIn_Submit();
		
		Assert.assertEquals(HomePage.SearchBox_Elmnt.isDisplayed(), true);
	}
}
