package com.google.meet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_testng {
	@Parameters({"Username","Password"})
	@Test
private void Valuepassed(String user,String password) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Meet\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement element = driver.findElement(By.id("email") );
	element.sendKeys(user);
	WebElement element2 = driver.findElement(By.id("pass"));
	element2.sendKeys(password);
}
}
