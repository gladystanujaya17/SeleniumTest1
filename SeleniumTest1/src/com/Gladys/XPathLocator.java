package com.Gladys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/documentation/");
		
		// Full/ Absolute XML Path (XPath)
		// Pilih Copy Full XPath
		driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div/button")).click();
		Thread.sleep(2000);
		
		
		// Relative XPath
		// Pilih Copy XPath
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"docsearch-input\"]"));
		searchBox.sendKeys("Documentation");
		searchBox.sendKeys(Keys.ENTER);
		
	}

}
