package com.google.meet;

import org.testng.annotations.Test;

public class Grouping_Class {
	@Test(groups = "s")
	private void monday() {
System.out.println("login time ");
	}
	@Test(groups = "u")
	private void tuesday() {
System.out.println("login time 10 am");
	}
	@Test(groups = "g" )
	private void wednesday() {
System.out.println(" login time 10.5 am");
}

}
