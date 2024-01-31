package com.Gladys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// #14 Handling Dropdown
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		// Dropdown
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		Select dropDownSelect = new Select(dropDown);
		
		// Select by index
		dropDownSelect.selectByIndex(2);
		
		Thread.sleep(2000);
		
		// Select by value
		dropDownSelect.selectByValue("1");
		
		Thread.sleep(2000);
		
		// Select by visible text
		dropDownSelect.selectByVisibleText("Option 2");
		
		// Get Options
		List<WebElement> listOptions = dropDownSelect.getOptions();
		
		for(WebElement option: listOptions) {
			System.out.println(option.getText()); // untuk mendapatkan teksnya dari pilihan
		}
	}

}
