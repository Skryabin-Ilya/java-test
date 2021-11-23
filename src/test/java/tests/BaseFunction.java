package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseFunction extends Base {
    public void Login(String name, String password) {
        driver.navigate().to("http://0.0.0.0:90/litecart/admin");
        wait.until((WebDriver d) -> d.findElement(By.name("username"))).sendKeys(name);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("login")).click();
    }

    public void clickLeftMenu()
    {
        List<WebElement> elements = driver.findElements(By.cssSelector("#sidebar ul#box-apps-menu > li"));
        for (int i = 0; i < elements.size(); i++)
        {
            driver.findElements(By.cssSelector("#sidebar ul#box-apps-menu > li")).get(i).click();
            List<WebElement> subElements = driver.findElements(By.cssSelector("ul.docs > li"));
            if (subElements.size() > 0)
            {
                for (int j = 0; j < subElements.size(); j++)
                {
                    driver.findElements(By.cssSelector("ul.docs > li")).get(j).click();
                    driver.findElement(By.cssSelector(".fa-stack.icon-wrapper")).isDisplayed();
                }
            }
        }
    }

    public void goToMainDirectory ()
    {
        driver.findElement(By.cssSelector(".header [title=\"Catalog\"]")).click();
    }

    public void searchImageSticker()
    {
        List <WebElement> image = driver.findElements(By.cssSelector(".image-wrapper"));
        for (int i = 0; i < image.size(); i++)
        {
            List <WebElement> sticker = image.get(i).findElements(By.cssSelector(".sticker"));
            assert sticker.size()==1;
        }
    }
}
