package com.BrowerOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserOptions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/?lang=en");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.co.in/");
		
//		Actions a=new Actions(driver);
//		a.contextClick(driver.findElement(By.xpath("//textarea[@id='APjFqb']"))).build().perform();
		
		driver.quit();
	
		

	}

}
