package com.Gladys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Studyopedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("First Java Program");
		
		// Selenium Chrome Web Driver
		// Pastikan version Chrome sama dengan Chrome Driver-nya
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Memperbesar window browser terlebih dahulu
		driver.manage().window().maximize();
		
		// Membuka website Selenium Dev
		driver.get("https://www.selenium.dev/");
		
		// Mencari judul halaman dan mengecek judul dari halaman website
		String title = driver.getTitle();
		System.out.println("Page title is: " + driver.getTitle());
		
		if("Selenium".equals(title)) {
			System.out.println("Titles match. Test case passed");
		}	
		else {
			System.out.println("Titles do not match. Test case failed");
		}
		
		// Menutup website
		driver.close();
		System.out.println("Successfully closed");

	}

}
