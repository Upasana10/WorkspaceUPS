package com.wd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class tofindsomething {
public static void main(String []args) {
	//System.setProperty("webDriver.gecko.driver", "E:\\UPS\\JAR\\geckodriver-v0.16.1-win64.exe");
	//WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "E:\\SELE_NIUM\\JAR\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
}
}
