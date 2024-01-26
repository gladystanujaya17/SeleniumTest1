package com.Gladys;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Implicit Wait -> Selenium 3
		// Applicable for all web elements
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Implicit Wait -> Selenium 4
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		By selectedDate = By.cssSelector("span#ct100_ContentPlaceholder1_Label1");
		
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		WebElement selectedDateBefore = driver.findElement(selectedDate);
		System.out.println("Before Selected Date: " + selectedDateBefore.getText().trim());
		
		// Explicit Wait -> untuk elemen spesifik
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// Wait for the loader element
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".raDiv123")));
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadCalendar1_Top\"]/tbody/tr[1]/td[6]/a")).click();
		WebElement selectedDateAfter = driver.findElement(selectedDate);
		System.out.println("Before Selected Date: " + selectedDateAfter.getText().trim());
	}

}
