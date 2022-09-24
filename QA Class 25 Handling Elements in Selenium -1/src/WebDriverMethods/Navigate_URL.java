package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_URL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		//d.get("https://www.saucedemo.com/");
		
		d.navigate().to("https://www.saucedemo.com/");
		
		
		

	}

}
