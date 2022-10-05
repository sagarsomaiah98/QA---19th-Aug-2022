package com.sauce.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;

public class LoginTest extends TestBase {
	@BeforeMethod
	public void intial() throws IOException {
		intialization();
		
		
	}
	
	@Test
	public void Validlogintest() throws IOException 
	{

	
    LoginPage l = new LoginPage();
    l.login("standard_user", "secret_sauce");
		
	}
	
	
	@Test
	public void invalidlogintest() throws IOException 
	{
	
	
    LoginPage l = new LoginPage();
    l.login("user1", "secret_sauce");
		
	}
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}

}
