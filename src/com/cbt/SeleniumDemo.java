package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "/Users/Kekeke/Documents/Selenium Dependencies/Drivers/chromedriver");
		 
		 WebDriver driver = new ChromeDriver(); 
		 driver.get("http://www.cybertekschool.com");

	}
	
//	public static void main(String[] args) {
//		 System.setProperty("webdriver.gecko.driver", "/Users/Kekeke/Documents/Selenium Dependencies/Drivers/geckodriver");
//		 
//		 WebDriver driver = new FirefoxDriver(); 
//		 driver.get("http://www.cybertekschool.com");
//
//	}
//	
//	public static void main(String[] args) {
//		 
//		 WebDriver driver = new SafariDriver(); 
//		 driver.get("http://www.cybertekschool.com");
//
//	}

}