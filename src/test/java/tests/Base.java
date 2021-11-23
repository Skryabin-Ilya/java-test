package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

    public WebDriverWait wait;
    protected ChromeDriver driver;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "/home/ilya/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void stop() {
//        driver.quit();
//        driver = null;
    }
}