package com.FreeCRM;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import util.Encoder_Decorder;
import util.Reusable;

public class TestCRMContacts {
	static Reusable reusable=new Reusable();
	static Encoder_Decorder decoder=new Encoder_Decorder();

	public static void main(String[] args) {
		
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://ui.cogmento.com/contacts");
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
	    
	    
	        
	        String encodevalue="c2FpLnAzNDJAZ21haWwuY29t";
	      String email=  decoder.deCoderInput(encodevalue);
	      reusable.enterTest(username, email);
	      String pass="MTIzNDU2Nzg5";
	      String passcode=  decoder.deCoderInput(pass);
	      WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	      reusable.enterTest(password, passcode);
	      driver.findElement(By.xpath("//div[text()='Login']")).click();
	      System.out.println(driver.getTitle());
	      
//	      WebElement span=driver.findElement(By.xpath("//span[text()='Contacts']/parent::a/i"));
	      Actions action=new Actions(driver);
//	    
//	      action.moveToElement(driver.findElement(By.xpath("//span[text()='Contacts']/parent::a/i"))).build().perform();
//	      span.click();
//	     WebElement contacts=driver.findElement(By.xpath("//span[text()='Contacts']/parent::a/span")); 
//	      action.moveToElement(contacts).build().perform();
//	      contacts.click();
	      String name="s s";
	      driver.findElement(By.xpath("//div[text()='Showing 4 records']")).click();
	     WebElement contactslist= driver.findElement(By.xpath("(//a[text()='"+name+"'])[2]/parent::td/preceding-sibling::td//div"));
	      action.moveToElement(contactslist).build().perform();
	      contactslist.click();
	      try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			//(//a[text()='sai prasanth'])[1]/parent::td/preceding-sibling::td//input
		}
	      driver.quit();
	      
	      

	}

}
