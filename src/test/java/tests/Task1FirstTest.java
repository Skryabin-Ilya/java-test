package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Task1FirstTest extends Base
{
    @Test
    public void FirstTest()
    {
        driver.navigate().to("http://www.google.com");
        wait.until((WebDriver d) -> d.findElement(By.name("q"))).sendKeys("webdriver");
        driver.findElement(By.name("btnK")).click();
        wait.until(titleIs("webdriver - Поиск в Google"));
    }
}