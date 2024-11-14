package test_amzn;

import org.testng.annotations.Test;

import source_amzn.HomePage;
import source_amzn.Prodct_Page;
import source_amzn.Product_List_Page;
import source_amzn.Sign_In_Page;
import source_amzn.Sign_In_Password_Page;
import source_amzn.View_WishList_Page;
import source_amzn.Your_List_Page;

public class TestCase04 extends LaunchQuit 
{
	@Test()
	public void Login_To_Amazon_Search_WishList_Cart_LogOut() throws InterruptedException
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
		PdctListPage.Product_01_Select();
		Prodct_Page PdctPage = new Prodct_Page(driver);
		PdctPage.Add_WishList(driver);
		// ------------------- View WishList -----------------------------------------//
		View_WishList_Page View_WishListPage = new View_WishList_Page(driver);
		View_WishListPage.View_WishList();
		
		// ------------------- Add to Cart -----------------------------------------//
		
		Your_List_Page yourListPage = new Your_List_Page(driver);
		yourListPage.Add_To_Cart();
		
		// ------------------- Sign Out -----------------------------------------//
//		Thread.sleep(2000);
		HomePage.Ac_List(driver);
		HomePage.Sign_Out();
	}
}
