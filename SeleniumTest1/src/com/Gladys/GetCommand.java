package com.Gladys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// #8 Get Command 
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://www.selenium.dev/");
		// Akan mengembalikan data dalam bentuk String
		String pageSource = driver.getPageSource();
		System.out.println("Page Source: " + pageSource);
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		// {Title: Selenium}
		
		// Mengklik ke link Downloads dan menampilkan URL dari Selenium Dev Downloads
		driver.findElement(By.linkText("Downloads")).click();
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		
		driver.close();
		
	}

}
