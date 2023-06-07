package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Iphone13 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monic\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Iphone 13");
		WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Go']"));
		searchBtn.click();
		WebElement first = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']"));
		first.click();

	}

}
