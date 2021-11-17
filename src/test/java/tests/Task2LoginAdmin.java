package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task2LoginAdmin extends Base
{
    @Test
    public void FirstTest()
    {
        driver.navigate().to("http://0.0.0.0:90/litecart/admin");
        wait.until((WebDriver d) -> d.findElement(By.name("username"))).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }
}
