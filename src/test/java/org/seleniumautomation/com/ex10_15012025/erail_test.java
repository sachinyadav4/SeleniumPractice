package org.seleniumautomation.com.ex10_15012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class erail_test {

    @Test
    public void test_erail(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://erail.in/");

        WebElement fromStation = driver.findElement(By.id("txtStationFrom"));

       fromStation.clear();

        Actions actions = new Actions(driver);

        actions.moveToElement(fromStation).click().sendKeys("DEL").build().perform();

        List<WebElement> fromStationSearchResult = driver.findElements(By.xpath("//div[@class='autocomplete']/child::div"));

        System.out.println(fromStationSearchResult.get(3).getText());

    }
}
