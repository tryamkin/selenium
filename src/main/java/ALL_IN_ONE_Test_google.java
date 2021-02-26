

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.security.KeyPair;

public class ALL_IN_ONE_Test_google {
    public static void main(String[] args) {

        Google_search();
    }
        public static void Google_search (){

            WebDriver driver = new ChromeDriver();
            driver.get("http://google.com.ua");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement search ;
            search = driver.findElement(By.name("q"));
            System.out.println("q");
            search.sendKeys(" Hi");
            search.sendKeys(Keys.RETURN);


            search.click();


            driver.close();
        }



}
