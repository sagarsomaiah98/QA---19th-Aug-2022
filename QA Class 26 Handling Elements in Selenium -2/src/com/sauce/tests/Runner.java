package com.sauce.tests;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		
		ValidateLogin l = new ValidateLogin();
		l.login();
		AddToCartTest a = new AddToCartTest();
		a.addtocart();
      LogOutTest lo= new LogOutTest();
        lo.logout();
		
	}

}
