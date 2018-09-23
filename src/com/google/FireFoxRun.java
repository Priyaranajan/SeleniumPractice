package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.ie.driver",
		// "‪C:\\driver\\IEDriverServer.exe");
		// InternetExplorerDriver driver = new InternetExplorerDriver();

		System.setProperty("webdriver.gecko.driver", "c://driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
	}
}
