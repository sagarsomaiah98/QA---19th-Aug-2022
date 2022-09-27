package com.sauce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public void login(String u, String p) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(u);
		
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(p);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		d.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		LoginTest l = new LoginTest();
		l.login("standard_user","secret_sauce");
		l.login("locked_out_user", "secret_sauce");
		l.login("problem_user", "secret_sauce");
		l.login("performance_glitch_user", "secret_sauce");
		

	}

}
