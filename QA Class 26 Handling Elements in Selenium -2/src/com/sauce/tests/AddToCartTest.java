package com.sauce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {
	
	public void addtocart() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\JANBASK\\QA - 19th Aug 2022\\DRIVERS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		try {
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		d.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		d.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		d.findElement(By.xpath("//button[@id='checkout']"));
		System.out.println("********** ADD TO CART TEST PASSED");
		}
		
		catch(Exception e) {
			
			System.out.println("************ADD TO CART TEST FAILED *************");
		}
		Thread.sleep(2000);
		d.close();
		

	}


	public static void main(String[] args) throws InterruptedException {
		
		
		AddToCartTest v = new AddToCartTest();
		v.addtocart();
	}
}
