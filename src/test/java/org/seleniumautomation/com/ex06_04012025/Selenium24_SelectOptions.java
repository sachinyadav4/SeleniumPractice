package org.seleniumautomation.com.ex06_04012025;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Selenium24_SelectOptions {

    @Test
    public void testmethod1() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select select = new Select(dropDown);
        select.selectByIndex(2);

        Thread.sleep(2000);

        select.selectByValue("1");

        Thread.sleep(2000);

        select.selectByVisibleText("Option 2");
    }
}
