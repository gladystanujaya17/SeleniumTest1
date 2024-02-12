package com.Gladys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa?");
		
		// Table 1
		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[4]")).getText());
		
		// Table 2 (Find how many <th> in one table)
		// Since there are more than 1 element, we use findElements 
		List<WebElement> allCols = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Number of columns: " + allCols.size());
		
		// Table 3 (Show all the table header)
		// Using for-loop
		// Web table starts from 1, not 0
		System.out.println("===");
		for(int i=1; i<=allCols.size(); i++) {
			System.out.print(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[" + i + "]")).getText() + " ");
		}
	}

}
