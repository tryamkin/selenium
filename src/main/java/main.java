
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Driver;

//import static java.lang.System.LoggerFinder.service;

public class main {

    //private static ChromeDriverService service;

    public static void main(String[] args) throws IllegalStateException, InterruptedException {

        String project = System.getProperty("user.dir");

        System.out.printf(project);
    System.getProperty("webdriver.chrome.driver", "C:\\Users\\Zver\\IdeaProjects\\Selenium_project\\lib\\");
       // ChromeOptions chromeOptions = new ChromeOptions();
       // chromeOptions.addArguments("--headless"); //谷歌浏览器无头模式
//  chromeOptions.addArguments("no-sandbox");//禁用沙盒
      // WebDriver driver = new ChromeDriver(service,chromeOptions);//使用端口
       // WebDriverManager.chromedriver().setup()
         WebDriver driver = new ChromeDriver();
       // "webdriver.chrome.driver", "/Driver/chromedriver.exe");
        driver.manage().window().maximize();

        driver.get("http://google.com.ua");
        driver.wait(10);
        driver.close();
    }
    //driver.quit();

}
