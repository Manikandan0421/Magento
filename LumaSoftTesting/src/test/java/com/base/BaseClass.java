package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().clearDriverCache().setup();
		 driver=new ChromeDriver();

	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}
	
	public static void loadUrl(String url) {
		driver.get(url);

	}
	
	public static void type(WebElement e,String value) {
		e.sendKeys(value);

	}
	public static void btnClick(WebElement e) {
		e.click();

	}
}
