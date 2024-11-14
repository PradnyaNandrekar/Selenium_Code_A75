package test_amzn;

import org.testng.annotations.Test;

import source_amzn.HomePage;
import source_amzn.Prodct_Page;
import source_amzn.Product_List_Page;
import source_amzn.Shopping_Cart_Page;
import source_amzn.Sign_In_Page;
import source_amzn.Sign_In_Password_Page;
import source_amzn.View_WishList_Page;
import source_amzn.Your_List_Page;

public class TestCase05 extends LaunchQuit
{
	@Test()
	public void Login_To_Amazon_Search_WishList_Cart_Remove_From_Cart_WIshList_LogOut() throws InterruptedException
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
		// ------------------- View Cart -----------------------------------------//
		yourListPage.View_Cart();
		// ------------------- Delete from Cart -----------------------------------------//
		Shopping_Cart_Page Shpng_CartPage = new Shopping_Cart_Page(driver);
		Shpng_CartPage.Delete_From_Cart();
		
		// ------------------- Go to WishList -----------------------------------------//
		HomePage.Ac_List(driver);
		HomePage.Go_To_Your_WishList();
	
		// ------------------- Delete from WishList -----------------------------------------//
		View_WishListPage.Delete_From_WishList();
		
		// ------------------- Sign Out -----------------------------------------//
		Thread.sleep(2000);
		HomePage.Ac_List(driver);
		HomePage.Sign_Out();
	}
}
