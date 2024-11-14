package source_amzn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class View_WishList_Page 
{
	@FindBy(linkText="View Your List")
	public WebElement ViewList_Elmnt;
	
	@FindBy(xpath="(//input[@name='submit.deleteItem'])[1]")
	WebElement Delete_From_WishList_Elmnt;
	
	public void View_WishList()
	{
		ViewList_Elmnt.click();
	}
	
	public void Delete_From_WishList() 
	{
		Delete_From_WishList_Elmnt.click();
		
	}
	
	public View_WishList_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
