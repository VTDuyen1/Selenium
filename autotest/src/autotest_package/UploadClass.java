package autotest_package;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class UploadClass {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/upload/";

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("/Users/nhatchau/Documents/rta-automation-test/appium-client/runtime/a.js");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }
}
