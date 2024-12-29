package com.ActionsPackage;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		
		Actions a=new Actions(driver);
     a.contextClick(driver.findElement(By.xpath("//textarea[@id='APjFqb']"))).sendKeys("ind vs Aus");
     a.keyDown(Keys.ENTER).keyDown(Keys.ENTER).build().perform();
     
     
    try {
     Thread.sleep(3000);
    }catch (Exception e) {
		// TODO: handle exception
    	e.printStackTrace();
	}
    
     
		driver.quit();

	
	}

}
