package source_amzn;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement Ac_List_Elmnt;
	
	@FindBy(xpath="(//a[.='Sign in'])[1]")
	WebElement Sign_In_Elmnt;
	
	@FindBy(xpath="//a[@id='nav-item-signout']")
	WebElement SignOut_Elmnt;
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement  SearchBox_Elmnt;
	
	@FindBy(xpath="(//a[.='Your Wish List'])[2]")
	WebElement View_Your_WishList_Elmnt;
	
	
	public void Ac_List(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(Ac_List_Elmnt).perform();
	}
	public void Sign_In()
	{
		Sign_In_Elmnt.click();
	}
	
	public void SearchProduct()
	{
		SearchBox_Elmnt.sendKeys("Shoe"+Keys.ENTER);;
	}
	
	public void Go_To_Your_WishList()
	{
		View_Your_WishList_Elmnt.click();
	}
	
	public void Sign_Out()
	{
		SignOut_Elmnt.click();
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
