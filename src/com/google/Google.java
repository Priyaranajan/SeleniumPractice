package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "‪F:\\SeleniumSetupFiles\\40\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();

			// System.setProperty("webdriver.gecko.driver",
			// "F:\\SeleniumSetupFiles\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			// WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();

			driver.get("https://www.google.com");
			driver.findElement(By.cssSelector("#gsr")).sendKeys(Keys.CONTROL + "T");
			driver.navigate().to("https://www.fb.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
