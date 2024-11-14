package source_amzn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_Password_Page 
{
	@FindBy(id="ap_password")
	WebElement Password_Elmnt;
	
	@FindBy(id="signInSubmit")
	WebElement SignIn_Submit_Elmnt;
	
	public void Enter_Password()
	{
		Password_Elmnt.sendKeys("Pratik*999");
	}
	public void SignIn_Submit()
	{
		SignIn_Submit_Elmnt.click();
	}
	
	
	public Sign_In_Password_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
