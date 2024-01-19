package com.Gladys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		// Kalau akan mengembalikan/ mengisi WebElement, bisa dibuat seperti dibawah codenya
		WebElement email = driver.findElement(By.id("email"));
		// Masukkan email = gladystana17@gmail.com
		email.sendKeys("gladystana17@gmail.com");
		
		// Selenium Locators 2: Name
		// Name input password di Stackoverflow = password
		WebElement password = driver.findElement(By.name("password"));
		// Masukkan password = clrtrsgldystnjy17_
		password.sendKeys("clarateresa1703");
		
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
		
		// #5 Selenium CSS Selectors
		
		
		// Selenium Locators 5: CSS
		// a. Pakai Tag dan ID 
		// Format: tag#id
		// Bagian button Log In
		driver.findElement(By.cssSelector("button#submit-button")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
		// b. Pakai Tag dan Attributes
		// Format: tag[attribute=attribute_name]
		// note: cari attribute yang unik dan tidak umum dipakai di elemen web lain
		WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
		searchBox.sendKeys("Selenium");
		searchBox.sendKeys(Keys.ENTER);
		
		// c. Pakai Tag dan Class
		// Format: tag.class-name
		// note: ambil parent-tag
		driver.findElement(By.cssSelector("svg.svg-icon.iconStackExchange")).click();
		
		// d. Pakai Tag, Class, dan Attribute
		// Format: tag.class[attribute=attribute_name]
		// Go to log out page
		driver.findElement(By.cssSelector("a.js-gps-track[href='https://stackoverflow.com/users/logout']")).click();
		
		// #6 LinkText and PartialLinkText
		
		
		// Setelah klik log out, mau mengarahkan ke laman web baru, yaitu stackexchange.com
		driver.findElement(By.linkText("stackexchange.com")).click();
		
		// Partial Link Text (hanya sebagian dari link saja)
		driver.findElement(By.partialLinkText("sites")).click();
		
	}
}
