package WebDriver_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\geckodriver.exe");
		
		//WebDriver driver1= new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\msedgedriver.exe");
		WebDriver driver2= new EdgeDriver();

		WebDriver driver3 = new OperaDriver();
		WebDriver driver4= new SafariDriver();
		WebDriver driver5 = new InternetExplorerDriver();
	
	}

}
