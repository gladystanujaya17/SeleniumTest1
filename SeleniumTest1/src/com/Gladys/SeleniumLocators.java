package com.Gladys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Membesarkan ukuran window chrome
		driver.manage().window().maximize();
		
		// Mengarahkan ke website login page
		driver.get("https://stackoverflow.com/users/login");
		
		// Selenium Locators 1: ID
		// ID input email di Stackoverflow = email
		WebElement email = driver.findElement(By.id("email"));
		// Masukkan email = gladystana17@gmail.com
		email.sendKeys("gladystana17@gmail.com");
		
		// Selenium Locators 2: Name
		// Name input password di Stackoverflow = password
		WebElement password = driver.findElement(By.name("password"));
		// Masukkan password = clrtrsgldystnjy17_
		password.sendKeys("clrtrsgldystnjy17_");
		
		// Selenium Locators 3: Class
		// Tambahkan click supaya bisa terpencet buttonnya
		// Log in
		
		// driver.findElement(By.className("flex--item s-btn s-btn__filled")).click(); -> ini error
		
		// Selenium Locators 4: Tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total anchor tags: " + links.size());
		
		// Total link yang bisa diklik (anchor)
		for(WebElement link: links) {
			System.out.println(link.getText());
		}
		
		driver.close();
	}
}
