package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monic\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title is  " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is  " + currentUrl);

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Facebook");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Password");
		
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		loginButton.click();
		//driver.quit();
	}
}
