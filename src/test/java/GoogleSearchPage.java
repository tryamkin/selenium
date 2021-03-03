import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {

    public static void main(String[] args) {

            //вызов метода
        searcTextGoogle();

    }
    public static void searcTextGoogle (){
        WebDriver driver = new ChromeDriver();
        // обявляем класс
        GoogleSearchPageElements googleSearchPageElements = new GoogleSearchPageElements(driver);
        driver.get("http://google.com.ua");
        //передаем не переменную в метод строка поиска
        googleSearchPageElements.googleStringSearchField("Hello world");
        googleSearchPageElements.clickGoogleCickButton();
        driver.close();
    }
}
