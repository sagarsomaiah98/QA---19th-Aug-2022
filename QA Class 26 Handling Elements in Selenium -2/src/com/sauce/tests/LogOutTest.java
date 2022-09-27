package com.sauce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
	
	public void logout() {
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		
		
		
		try {
			
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[@class='title']"));
		d.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		d.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		d.findElement(By.xpath("//input[@id='login-button']"));
		System.out.println("******LOGOUT  TEST PASSED *********");
		
		}
		catch(Exception e) {
			
			System.out.println("********* LOGOUT TEST FAILED*****************");
			System.out.println("user not able to logout");
		}
		
		d.quit();

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
