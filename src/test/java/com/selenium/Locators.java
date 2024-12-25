package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {



    public static void main(String[] args) {
        

        WebDriver driver=new ChromeDriver();
driver.get("https://artoftesting.com/samplesiteforselenium");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


/*
 * Below is the code return for By return value as the xpath 
 */
//By textbox=By.xpath("//input[@id='fname']");
//driver.findElement(textbox).sendKeys("textbox entered");

//driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("textbox entered");

/*
 * Below is the syntax used for the id locator
 */

//driver.findElement(By.id("fname")).sendKeys("textbox entered");

/*
 * Below is the locator used for the name locator
 */
driver.findElement(By.name("firstName")).sendKeys("textbox entered");

try {
    Thread.sleep(3000);
} catch (Exception e) {
    e.printStackTrace();
}
driver.quit();


    }

    

}
