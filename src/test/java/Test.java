import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello world");
        m1();
    }

    public static void m1(){
System.out.println("hello m1");
        System.out.println("hello m1");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        //driver.getTitle();
        System.out.println(driver.getTitle());
        driver.manage().deleteAllCookies();
        driver.quit();

        driver=new FirefoxDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        //driver.getTitle();
        System.out.println(driver.getTitle());
        driver.manage().deleteAllCookies();
        driver.quit();

    }

    
}
