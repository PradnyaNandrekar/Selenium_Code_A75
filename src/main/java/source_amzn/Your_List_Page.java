package source_amzn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Your_List_Page 
{
	
	@FindBy(xpath="( //a[@class='a-button-text a-text-center'])[1]")
	WebElement Add_Cart_Btn_Elmnt;
	
	@FindBy(xpath="//a[.='View Cart']")
	WebElement view_Cart_Elmnt;
	
		
	public void Add_To_Cart()
	{
		Add_Cart_Btn_Elmnt.click();
		
	}
	public void View_Cart()
	{
		view_Cart_Elmnt.click();
	}
	
	public Your_List_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
