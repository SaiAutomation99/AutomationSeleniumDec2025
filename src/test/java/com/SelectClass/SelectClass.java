package com.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame("iframeResult");
		WebElement select=driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select select1=new Select(select);
		System.out.println(select1.getOptions().size());
		select1.selectByVisibleText("Audi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		try {
		Thread.sleep(3000);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
		//System.out.println(select1.getOptions().size());
		
		System.out.println(driver.getTitle());
		
	driver.quit();

	}

}
