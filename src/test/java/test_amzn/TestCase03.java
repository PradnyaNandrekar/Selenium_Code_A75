package test_amzn;
//---------------------------------- Login-Search-Add to WishList-LogOut -------------------------------------------------------------------

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import source_amzn.HomePage;
import source_amzn.Prodct_Page;
import source_amzn.Product_List_Page;
import source_amzn.Sign_In_Page;
import source_amzn.Sign_In_Password_Page;
import source_amzn.View_WishList_Page;

public class TestCase03 extends LaunchQuit 
{
	@Test()
	public void Login_To_Amazon_Search_WishList_LogOut() throws InterruptedException
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
		// ------------------- Add 1st Product to WishList -----------------------------------------//
		Product_List_Page PdctListPage = new Product_List_Page(driver);
		
		//--------------------Assert True if Products > 1 Found --------------------------------//
		Assert.assertEquals(PdctListPage.Prodct_List.size()>1, true);
		// ------------------- Add 1st Product to WishList -----------------------------------------//
		PdctListPage.Product_01_Select();
		Prodct_Page PdctPage = new Prodct_Page(driver);
		PdctPage.Add_WishList(driver);
		
		// ------------------- View WishList -----------------------------------------//
		View_WishList_Page View_WishListPage = new View_WishList_Page(driver);
		Assert.assertEquals(View_WishListPage.ViewList_Elmnt.isDisplayed(), true);
		Reporter.log("----------Product added to WishList----------");
		View_WishListPage.View_WishList();
		
		
		// ------------------- Sign Out -----------------------------------------//

		HomePage.Ac_List(driver);
		HomePage.Sign_Out();
		//--------------------Assert True if Sing Out successful --------------------------------//
		Assert.assertEquals(SingInPage.UserName_Elmnt.isDisplayed(), true);
		Reporter.log("----------Sign Out Successfull----------");
	}
}
