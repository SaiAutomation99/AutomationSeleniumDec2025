package com.FreeCRM;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
	      reusable.enterTest(username, passcode);
	      
	      System.out.println(driver.getTitle());
	      driver.quit();
	      
	      

	}

}
