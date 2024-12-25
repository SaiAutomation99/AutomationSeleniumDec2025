package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {



    public static void main(String[] args) {
        

        WebDriver driver=new ChromeDriver();
driver.get("https://artoftesting.com/samplesiteforselenium");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("textbox entered");

try {
    Thread.sleep(3000);
} catch (Exception e) {
    e.printStackTrace();
    // TODO: handle exception
}
driver.quit();


    }

    

}
