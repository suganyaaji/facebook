package com.google.meet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@DataProvider(name="login")
	private String[][] testing() {
		return new String[][] {
			{"suga","#123"},
			{"rishi","#123"},
			{"san","#123"}
		};

	}
	@Test(dataProvider = "login")
	private void intializing(String username,String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Meet\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement dd = driver.findElement(By.id("email"));
		dd.sendKeys("username");
		WebElement ff = driver.findElement(By.id("pass"));
	    ff.sendKeys("password");
		
		
		
		

}
	
	

}
