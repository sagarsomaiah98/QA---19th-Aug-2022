package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.findElement(By.xpath("//a[normalize-space()='']")).click();
		
	//	d.close();
		

	}

}
