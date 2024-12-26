package com.selenium.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAttributes {

  public static void main(String[] args) {
        

        WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

/*
 * Multiple attributes below is the xpath
 * driver.findElement(By.xpath("//textarea[@id='APjFqb'][@class='gLFyf']")).sendKeys("selenium hq");
 * 
 */



/*
 * AND condition
 * driver.findElement(By.xpath("//textarea[@id='APjFqb' and @class='gLFyf']")).sendKeys("selenium hq");
 */

 /*
  * OR condition 
    driver.findElement(By.xpath("//textarea[@id='APjFqb' or @class='gLFyf']")).sendKeys("selenium hq");

  */
  
  /*
   * contains condition
   * driver.findElement(By.xpath("//textarea[contains(@id,'A')]")).sendKeys("selenium hq");
   */
  
try {
    Thread.sleep(3000);
} catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
}
driver.quit();

  }
}
