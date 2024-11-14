package test_amzn;
//---------------------------------- Login-Search-LogOut -------------------------------------------------------------------

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import source_amzn.HomePage;
import source_amzn.Sign_In_Page;
import source_amzn.Sign_In_Password_Page;

public class TestCase02 extends LaunchQuit
{
	@Test()
	public void Login_To_Amazon_Search_LogOut() throws InterruptedException
	{
		// ------------------- Sign In -----------------------------------------//
		HomePage HomePage = new HomePage(driver);
		HomePage.Ac_List(driver);
		HomePage.Sign_In();
		Sign_In_Page SingInPage = new Sign_In_Page(driver);
		SingInPage.UserName();
		SingInPage.Continue_Click();
		Sign_In_Password_Page SignInPwPage = new Sign_In_Password_Page(driver);
		SignInPwPage.Enter_Password();
		SignInPwPage.SignIn_Submit();
		// ------------------- Search -----------------------------------------//
		HomePage.SearchProduct();
		
		// ------------------- Sign Out -----------------------------------------//
		HomePage.Ac_List(driver);
		HomePage.Sign_Out();
		//--------------------Assert True if Sing Out successful --------------------------------//
		Assert.assertEquals(SingInPage.UserName_Elmnt, true);
		Reporter.log("----------Sign Out SuccessFull----------");
	}
	
	
	
}
