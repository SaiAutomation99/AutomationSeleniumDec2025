package com.selenium.practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
       
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("freecrm");
Robot robo=new Robot();
robo.keyPress(KeyEvent.VK_ENTER);
robo.keyRelease(KeyEvent.VK_ENTER);



		
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(NoSuchElementException.class);
	
	WebElement element=wait.until(new Function<WebDriver, WebElement>() {

		@Override
		public WebElement apply(WebDriver driver) {
			
			return driver.findElement(By.xpath("//a[text()='Calls view']"));
		}
		
		
	});
	
	element.click();

    driver.quit();
	}

}
