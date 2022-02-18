package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.PageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base implements Interfaces.Base {
    public static WebDriver driver;
    public static Properties prop;
    public static PageObject pageFactory;
    @BeforeClass
    public  void launch() throws IOException {
        String path = System.getProperty("user.dir")+"//src/test/java/Resorces/config.properties";
        System.out.println(path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pageFactory = new PageObject();
        driver.manage().window().maximize();
        prop = new Properties();
        FileInputStream ip= new FileInputStream(path);
        prop.load(ip);
        driver.navigate().to(prop.getProperty("url"));
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }

    @AfterSuite
    public void closeAllBrowser(){
        driver.quit();
    }

}
