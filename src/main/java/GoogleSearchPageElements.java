import elements.Google_Search_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageElements {
// Описание элементов на одной странице для чеклиста
    WebDriver driver = null;
    // создаем ссылки на элементы страницы
    By googleSearchField = By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By googleSearchButton = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");

    //конструктор который принимает драйвер
    public GoogleSearchPageElements(WebDriver driver) {
        this.driver = driver;
    }
        // функция которая принимает параметр переменной textsearch при вызове
    public void googleStringSearchField(String textsearch) {

        driver.findElement(googleSearchField).sendKeys(textsearch);
    }

    public void clickGoogleCickButton() {
        driver.findElement(googleSearchButton).sendKeys(Keys.RETURN);
    }
}
