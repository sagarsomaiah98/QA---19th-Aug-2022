package com.sauce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {
	
	public void login() {
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		
		
		
		try {
			
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
	
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[@class='title']"));
		System.out.println("****** TEST PASSED *********");
		
		}
		catch(Exception e) {
			String error=d.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
			System.out.println(error);
			System.out.println("*********TEST FAILED*****************");
			System.out.println("user not able to login");
		}
		
		d.quit();

	}

	public static void main(String[] args) throws InterruptedException {
	
	}

}
