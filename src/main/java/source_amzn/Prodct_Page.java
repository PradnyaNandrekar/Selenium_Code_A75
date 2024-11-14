package source_amzn;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Prodct_Page
{
	@FindBy(id="wishListMainButton")
	WebElement add_WishList_Elmnt;
	
	@FindBy(xpath="//span[.='One item added to']")
	WebElement text_add_WishList_Msg_Elmnt;
	
	public void Add_WishList(WebDriver driver)
	{
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> is1 = s1.iterator();
		String parentID = is1.next();
		String childID = is1.next();
		driver.switchTo().window(childID);
		add_WishList_Elmnt.click();
	}
	
		
	public Prodct_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
