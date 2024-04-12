package com.google.meet;


import org.testng.annotations.Test;

public class Dependon_Method {
	@Test
	private void signup() {
System.out.println("signup");
	}
	@Test
	private void login() {
System.out.println("login");
	}
	
	@Test
	private void searchproduct() {
System.out.println("100 ");
	}
	
	@Test(dependsOnMethods = "searchproduct")
	private void addtocart() {
System.out.println(" add to cart");

	}
	
	@Test
	private void signout() {
System.out.println("sign out");
	}

}
