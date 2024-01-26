package com.Gladys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleTextBoxRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// #12 Handling TextBox
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Implicit wait -> karena ada load pas klik button Disable
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));
		System.out.println("Is textBox displayed: " + textBox.isDisplayed());
		System.out.println("Is textBox enabled: " + textBox.isEnabled());
		
		// Change from disabled to enabled
		WebElement button = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
		System.out.println("Is button displayed: " + button.isDisplayed());
		System.out.println("Is button enabled: " + button.isEnabled()); // {jawaban: button enabled (true)} -> karena itu bisa diklik
		button.click();
		System.out.println("Is button enabled after click: " + button.isEnabled());

		
		// Explicit Wait 1 (Enabled the text box)
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// Ini wait akan berhenti kalau kondisi (text It's enabled! muncul setelah klik button Disable)
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"message\"]")), "It's enabled"));
		System.out.println("Is textBox enabled after button click: " + textBox.isEnabled());
		textBox.sendKeys("Hello");
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
		button1.click();
		
		// Explicit Wait 2 (Disabled the text box)
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//*[@id=\\\"input-example\\\"]/button"), "It's disabled"));
		
//		Thread.sleep(30);
//		driver.close();
//		driver.quit();
	}

}
