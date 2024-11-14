package source_amzn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_Page 
{
	WebDriver driver;
	@FindBy(id="ap_email")
	
	public WebElement UserName_Elmnt;
	
	@FindBy(id="continue")
	WebElement Continue_Btn_Elmnt;
	
	public void UserName()
	{
		UserName_Elmnt.sendKeys("8605119718");
	}
	
	public void Continue_Click()
	{
		Continue_Btn_Elmnt.click();
	}
	
	public Sign_In_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
