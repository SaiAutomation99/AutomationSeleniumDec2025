package com.selenium.practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitExample {
	
	private static final Logger logger = LogManager.getLogger(ExplicitWaitExample.class);

	public static void main(String[] args) throws AWTException, Exception {


		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Set <Cookie>  cookies=driver.manage().getCookies();
		Iterator<Cookie> it=cookies.iterator();
		while(it.hasNext()) {
			
			
			//System.out.println(it.next());
		}
		//System.out.println(cookies.size());
		
		logger.info("This is an info log message");
	
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='APjFqb']")));
		element.sendKeys("freecrm");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		//element.click();
		//driver.findElement(By.xpath("//a[text()='CRMPRO Log In Screen']")).click();
		
Thread.sleep(3000);

driver.quit();

	}

}
