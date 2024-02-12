package com.Gladys;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		// Implicitly Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Click Hotels
		driver.findElement(By.xpath("//*[@id=\"stayIcon\"]/a/span")).click();
		
		Set<String> handles = driver.getWindowHandles(); // ParentID, ChildID, SubChildID
		Iterator it = handles.iterator();
		String parentID = (String) it.next();
		String childID = (String) it.next();
		driver.switchTo().window(childID);
		
		// Click Bus Ticket
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/div/div/ul/li[3]/a")).click();
		
		// Note:
		// - Every window has 1 ID
	}

}
