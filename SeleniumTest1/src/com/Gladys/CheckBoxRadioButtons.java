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
		
		System.out.println("***CHECKBOX***");
		
		// Checkbox 1
		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		System.out.println("Is checkBox1 displayed: " + checkBox1.isDisplayed());
		System.out.println("Is checkBox1 enabled: " + checkBox1.isEnabled());
		System.out.println("Is checkBox1 selected: " + checkBox1.isSelected()); //false
		checkBox1.click(); //select
		System.out.println("Is checkBox1 selected after clicked: " + checkBox1.isSelected()); //true
		
		System.out.println("-----");
		
		// Checkbox 2
		WebElement checkBox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		System.out.println("Is checkBox1 displayed: " + checkBox2.isDisplayed());
		System.out.println("Is checkBox1 enabled: " + checkBox2.isEnabled());
		System.out.println("Is checkBox1 selected: " + checkBox2.isSelected()); //true
		checkBox2.click(); //deselect
		System.out.println("Is checkBox1 selected after clicked: " + checkBox2.isSelected()); //false

		// Radio Button
		System.out.println("***RADIO BUTTONS***");

		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		
		WebElement radioButtonOpt2 = driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));
		System.out.println("Is option 2 displayed: " + radioButtonOpt2.isDisplayed());
		System.out.println("Is option 2 enabled: " + radioButtonOpt2.isEnabled());
		System.out.println("Is option 2 selected: " + radioButtonOpt2.isSelected()); // false
		radioButtonOpt2.click(); // select
		System.out.println("Is option 2 selected after clicked: " + radioButtonOpt2.isSelected()); // true
	}

}
