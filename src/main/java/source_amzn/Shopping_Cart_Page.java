package source_amzn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Cart_Page 
{
	@FindBy(xpath="(//input[@class='a-color-link'])[1]")
	WebElement Delete_From_Cart_Btn_Elmnt;

	public void Delete_From_Cart()
	{
		Delete_From_Cart_Btn_Elmnt.click();
	}

	public Shopping_Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
