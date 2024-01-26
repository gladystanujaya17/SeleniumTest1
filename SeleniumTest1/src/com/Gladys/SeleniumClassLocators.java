package com.Gladys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClassLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in/");
		
		// Selenium Locators 3: Class
		// Tambahkan ENTER supaya langsung di-enter
		WebElement location = driver.findElement(By.className("_1xq16jy"));
		location.sendKeys("Goa", Keys.ENTER);
		
		driver.close();
		
	}

}
