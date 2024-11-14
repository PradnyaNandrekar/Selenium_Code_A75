package source_amzn;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_List_Page 
{
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement Prod_01_Elmnt;
	
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-tall-aspect']")
	public List<WebElement> Prodct_List;
	
	public void Product_01_Select()
	{
		Prod_01_Elmnt.click();
	}
	public Product_List_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
