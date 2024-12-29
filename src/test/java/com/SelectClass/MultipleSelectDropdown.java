package com.SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.switchTo().frame("iframeResult");
		
WebElement select=driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select select1=new Select(select);
		System.out.println(select1.getOptions().size());
		select1.selectByContainsVisibleText("Volvo");
		select1.selectByContainsVisibleText("Saab");
		select1.selectByContainsVisibleText("Opel");
		select1.selectByContainsVisibleText("Audi");
		List<WebElement> alloptions=select1.getAllSelectedOptions();
		for(int i=0;i<alloptions.size();i++) {
			
			System.out.println(alloptions.get(i).getText());
		}
		select1.deSelectByContainsVisibleText("Volvo");
		select1.deSelectByContainsVisibleText("Saab");
		select1.deSelectByContainsVisibleText("Opel");
		select1.deSelectByContainsVisibleText("Audi");
		
		
	boolean b=	select1.isMultiple();
	if(b) {
		
		System.out.println("it is a multi select dropdown");
	}else {
		
		System.out.println("it is not multi select dropdown");
	}
	
	
	try {
		Thread.sleep(3000);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		driver.quit();

	}

}
