package Maven_Project1.package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Reverse_String {

	public static void main(String[] args) throws IOException 
	{
//		StringBuffer s1 = new StringBuffer("Automation");
//		s1.reverse();
//		System.out.println(s1);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		
//		WebDriver driver1;
		WebElement e1 = driver.findElement(By.xpath(""));
//		e1.isDisplayed();
		
		/*Select s1 = new Select(e1);
		s1.selectByIndex(0);
		s1.selectByVisibleText(null);
		s1.selectByValue(null);*/
		
//		Actions a1 = new Actions(driver);
//		a1.dragAndDrop(e1, e1).perform();
//		a1.contextClick(e1).perform();
//		a1.doubleClick(e1).perform();
		
//		List<WebElement> s1 =driver.findElements(null);
//		WebElement ex = s1.get(0);
//		String sx = ex.getText();
		
//		TakesScreenshot ts = driver;
//		File scrnShot = ts.getScreenshotAs(OutputType.FILE);
//		File FileLocation = new File("Location");
//		FileHandler.copy(scrnShot, FileLocation);
		
//		ChromeOptions chs = new ChromeOptions();
//		chs.addArguments("--headless");
//		ChromeDriver driverx = new ChromeDriver(chs);
//		
		
//		Point pt = e1.getLocation();
//		int X = pt.getX();
//		int Y =pt.getY();
//		
//		JavascriptExecutor jsE = driver;
//		jsE.executeScript("windows.ScrollBy(x,y)");
		
		FileInputStream f1 = new FileInputStream(""); 
		Workbook wb = WorkbookFactory.create(f1);
		String data1 = wb.getSheet("").getRow(0).getCell(0).getStringCellValue();
	}
	
//	@DataProvider(name="set1")
//	public Object[][] method1()
//	{
//		Object[][] dataset = new Object[4][2];
//		dataset[0][0] = "abs";
//		dataset[1][0] = "abs";
//		dataset[2][0] = "abs";
//		dataset[3][0] = "abs";
//		dataset[0][1] = "abs";
//		dataset[1][1] = "abs";
//		dataset[2][1] = "abs";
//		dataset[3][1] = "abs";
//		return dataset;
//	}
//	
//	@Test(dataProvider="set1")
//	public void test1(String s1, String s2)
//	{
//		System.out.println(s1);
//		System.out.println(s2);
//	}
	
	
}
