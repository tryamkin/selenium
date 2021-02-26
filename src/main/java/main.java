

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Driver;

//import static java.lang.System.LoggerFinder.service;

public class main {

    //private static ChromeDriverService service;

    public static void main(String[] args) throws IllegalStateException, InterruptedException {
        //see work directory
        String projectpath = System.getProperty("user.dir");
        System.out.printf(projectpath);
        // see the way to file - Make and add to directory Driver in the project - chormedriver
        String way1 = System.getProperty("webdriver.chrome.driver", projectpath+"\\Driver\\chromedriver.exe");
        String way = System.getProperty("webdriver.chrome.driver", "C:\\Users\\Zver\\IdeaProjects\\Selenium_project\\lib\\chromedriver.exe");
        System.out.println("  \n" + way + "  \n" + way1);

        // ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.addArguments("--headless"); //谷歌浏览器无头模式
        //  chromeOptions.addArguments("no-sandbox");//禁用沙盒
        // WebDriver driver = new ChromeDriver(service,chromeOptions);//使用端口
        // WebDriverManager.chromedriver().setup()
        WebDriver driver = new ChromeDriver();
        // "webdriver.chrome.driver", "/Driver/chromedriver.exe");
        driver.manage().window().maximize();
        System.out.printf("start");
        driver.get("http://google.com.ua");
        System.out.printf("open page");
        //name of Search field "q"
        driver.findElement(By.name("q")).sendKeys("2df2fd2fd");
        Thread.sleep(3000);
        driver.wait(2);


        ((ChromeDriver) driver).findElementByCssSelector("div[class='FPdoLc tfB0Bf'] input[name='btnK']").click();

        driver.findElement(By.name("btnK")).click();
         WebElement searchline = ((ChromeDriver) driver).findElementByClassName("gLFyf.gsfi");

        searchline.sendKeys("Testing find by Classname and imput string");
        WebElement findByName = driver.findElement(By.id("q"));
        findByName.sendKeys("this is find by name");
        //driver.wait(10);
        //waiting

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
        driver.quit();
    }


}
