package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.saucedemo.com/");
		
		d.manage().window().maximize();
		Thread.sleep(2000);
		
	//	d.manage().window().minimize();
	//	d.close();
		d.quit();
		

	}

}
