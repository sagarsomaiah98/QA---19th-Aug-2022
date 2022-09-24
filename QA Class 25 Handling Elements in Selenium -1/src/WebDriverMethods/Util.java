package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Util {
	
	public static WebDriver driver;
	
	public static void type(String xpath,String value) 
	{
	
        
        driver.findElement(By.xpath(xpath)).sendKeys(value);
		
		
		
	}

	
	public static void click(String xpath) 
	{
		
		driver.findElement(By.xpath(xpath)).click();
	}
}
