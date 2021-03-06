package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void run()
	{
		WebDriver driver = new ChromeDriver();
		Reporter.log("The browser is opened now");
		driver.manage().window().maximize();
		Reporter.log("The browser is maximized");
		driver.get("https://www.google.co.in");
		Reporter.log("The Google website is opened");
		driver.findElement(By.id("gsr")).sendKeys("Hi");
		Reporter.log("The data \"HI\" is entered");
	}
}
