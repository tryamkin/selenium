package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google_Search_elementsTestNG {


   WebDriver driver = null;
    By googleSearchField = By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By googleSearchButton = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
    @BeforeTest
    public void setup (){
        driver = new ChromeDriver();
        System.out.println("strating");
    }
    @Test
    public void searching () {
        driver.get("http://google.com.ua");
        driver.findElement(googleSearchField).sendKeys("testNg");
        driver.findElement(googleSearchButton).sendKeys(Keys.RETURN);
        System.out.println("testing...");
    }
    @AfterTest
    public  void endtest (){
        driver.close();
        driver.quit();
        System.out.println("done");
    }
}
