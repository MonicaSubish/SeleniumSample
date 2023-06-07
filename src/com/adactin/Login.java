package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monic\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("Monica84");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("monica1234");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='Submit']"));
		loginBtn.click();

	}

}
