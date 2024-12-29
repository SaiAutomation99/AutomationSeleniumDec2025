package com.selenium.practise;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/?gad_source=1&gclid=EAIaIQobChMIquyTzc7JigMVkIJLBR2h2iI7EAAYASAAEgKpyvD_BwE");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Nellore");
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		//driver.findElement(By.xpath("//text[text()='30 Dec']")).click();
		//driver.findElement(By.xpath("//button[@id='search_button']")).click();
		Thread.sleep(3000);
		WebElement elements= driver.findElement(By.xpath("//div[@class='sc-kAzzGY cCrHkP']/text"));
		if(elements.isDisplayed()) {
			
			System.out.println("true");
		}
		System.out.println(elements.getText());
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		
		WebElement element=wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				
				//return driver.findElement(By.xpath("//div[@class='sc-jzJRIG hrJoel']"));
				
				return driver.findElement(By.xpath("//text[text()='30 Dec']"));
				
			}
		});
		
		element.click();
	
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		//div[@class='sc-jzJRIG hrJoel']

	}

}
