package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRegister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monic\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement newUser = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		newUser.click();
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Monica84");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("monica1234");
		WebElement confPassword = driver.findElement(By.xpath("//input[@name='re_password']"));
		confPassword.sendKeys("monica1234");
		WebElement fullName = driver.findElement(By.xpath("//input[@name='full_name']"));
		fullName.sendKeys("Monica Subish");
		WebElement emailId = driver.findElement(By.xpath("//input[@name='email_add']"));
		emailId.sendKeys("monica.subish@gmail.com");
		Thread.sleep(20000);
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		WebElement register = driver.findElement(By.xpath("//input[@type='submit']"));
		register.click();
	}

}
