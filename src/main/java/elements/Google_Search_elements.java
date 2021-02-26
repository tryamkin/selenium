package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class Google_Search_elements {

    private static WebElement element = null;
    private static WebElement button = null;
    private static WebElement clear ;

    public static WebElement Object_string(WebDriver driver) {
        element = driver.findElement(By.name("q"));
        return element;
    }

    public static WebElement button_cxlick(WebDriver driver) {

        button = driver.findElement(By.name("btnK"));
        return button;
        }

        public static WebElement Set_clear_form (WebDriver driver){
        clear = driver.findElement(By.cssSelector("div[aria-label='Очистить']"));
        return clear;
        }
}
