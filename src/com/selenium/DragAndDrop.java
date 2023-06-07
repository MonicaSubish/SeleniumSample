package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\monic\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, dest).perform();

	}

}
