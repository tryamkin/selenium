
import elements.Google_Search_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//using external reference in package

public class Test_one {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        Thread.sleep(10);
        Google_Search_elements.Object_string(driver).sendKeys("Hello Google!!!");
        //driver.wait(10);
        System.out.println("wait");
       Google_Search_elements.Object_string(driver).sendKeys(Keys.RETURN);
        System.out.println("btnKlick");
        Google_Search_elements.Set_clear_form(driver).click();
        Thread.sleep(10);
        System.out.println("clear");
        driver.findElement(By.id("logo")).click();
        System.out.println("return");
        Thread.sleep(100);
        driver.close();
        System.out.println("close");
    }
}
