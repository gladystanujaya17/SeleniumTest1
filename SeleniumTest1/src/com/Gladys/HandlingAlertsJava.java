package com.Gladys;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
		// Link Text
		// Link Text Simple Alert
		//driver.findElement(By.linkText("See an example alert")).click();
		
		// Link Text Confirmation Alert
		driver.findElement(By.linkText("See a sample confirm")).click();
		
		// Link Text Prompt Alert
		// driver.findElement(By.linkText("See a sample prompt")).click();
		
		// Handle Simple Alert (hanya ada button OK)
//		Alert alert = driver.switchTo().alert();
//		System.out.println("Alert message: " + alert.getText());
//		Thread.sleep(2000);
//		alert.accept(); // klik button OK di alert
		
		// Handle Confirmation Alert (ada 2 pilihan, OK dan Cancel)
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert message: " + alert.getText());
		Thread.sleep(2000);
		alert.dismiss(); // klik button Cancel di alert
		
		// Handle Prompt Alert (ada text box dan button OK dan button Cancel)
//		Alert alert = driver.switchTo().alert();
//		System.out.println("Alert message: " + alert.getText());
//		Thread.sleep(2000);
//		alert.sendKeys("Hello guys");
//		Thread.sleep(2000);
//		alert.accept();
		
	}

}
