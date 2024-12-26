package com.selenium.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrecedingExample {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

driver.findElement(By.xpath("//textarea[@id='APjFqb']//following::div[@id='SIvCob']/a[text()='ਪੰਜਾਬੀ']//preceding::textarea[@id='APjFqb']")).sendKeys("hello");
try {
	Thread.sleep(3000);
} catch (Exception e) {
	// TODO: handle exception
}
driver.quit();
	}

}
