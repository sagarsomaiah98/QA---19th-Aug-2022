package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_util extends Util {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
        driver= new ChromeDriver();
        
        driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		type("//input[@id='user-name']", "standard_user");
		type("//input[@id='password']","secret_sauce");
		click("//input[@id='login-button']");
		
        
		
		

	}

}
