package com.alert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsreF/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		//a.accept();
		//a.dismiss();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(3000);
			
		} catch (Exception e) {
e.printStackTrace();		}
		

		driver.quit();
	}

}
