package com.Gladys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// #9 Navigation Commands
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// navigate().to() -> method
		// navigate().to() -> navigasi halaman dengan cara forward/ backward URL
		// get() -> refresh page, jadi dia bakal ganti URL, bukan bolak balik URL dalam satu URL yang sama
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("We are on home page: " + driver.getCurrentUrl());
		
		// Cara 1 untuk ke search page
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Alexa" + Keys.ENTER);
		// Or use this code
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Alexa " + Keys.RETURN);
		System.out.println("We are on search page: " + driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("We are on home page: " + driver.getCurrentUrl());
		
		// Cara 2 untuk ke search page
		driver.navigate().forward();
		System.out.println("We are on search page: " + driver.getCurrentUrl());
		
		// Refresh page
		driver.navigate().refresh();
		
		// Use get() will change the URL from Amazon to Spotify
		driver.get("https://open.spotify.com/");

		driver.close();
	}

}
