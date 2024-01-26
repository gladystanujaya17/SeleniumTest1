package com.Gladys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// #13 Handling CheckBoxes and RadioButtons
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		System.out.println("Is checkBox1 displayed: " + checkBox1.isDisplayed());
		System.out.println("Is checkBox1 enabled: " + checkBox1.isEnabled());
		System.out.println("Is checkBox1 selected: " + checkBox1.isSelected());
		checkBox1.click();
		System.out.println("Is checkBox1 selected after clicked: " + checkBox1.isSelected());

	}

}
