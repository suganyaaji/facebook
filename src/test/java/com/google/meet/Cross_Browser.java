package com.google.meet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser {
	WebDriver driver;
	ChromeOptions a=new ChromeOptions();
	FirefoxOptions b= new FirefoxOptions();
	EdgeDriver c= new EdgeDriver();
	@Parameters("browser")
	@BeforeTest
 private void inistialize(String browser ) {
	 if (browser.equalsIgnoreCase("Chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		System.out.println("chromedriver is launched");
		
	}
	 else if (browser.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		System.out.println("firefoxdriver is launched");
	}
	 else if (browser.equalsIgnoreCase("Edge")) {
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 System.out.println("edgedriver is launched");
		 
		
	}

}
 @Test
 private void facebook() {
	 driver.get("https://www.facebook.com/");
	 String actual = driver.getTitle();
	 String expected = "face";
	 Assert.assertEquals(actual.contains("face"),expected.contains("face") );
	 
	 
	 

}
	}

	
	
 

 