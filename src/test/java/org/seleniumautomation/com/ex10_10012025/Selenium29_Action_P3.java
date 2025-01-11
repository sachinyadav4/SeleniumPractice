package org.seleniumautomation.com.ex10_10012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium29_Action_P3 {

    EdgeDriver driver;

    @BeforeTest
    public void testmethod_action_tc1(){
        driver = new EdgeDriver();
    }


    @Test
    public void testmethod_action_tc3() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

         WebElement fromCity = driver.findElement(By.id("fromCity"));

         Actions actions = new Actions(driver);

         actions.moveToElement(fromCity).click().build().perform();
        actions.moveToElement(fromCity).click().sendKeys("HYD").build().perform();

        List<WebElement> sourceList = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li/div/div/p/span/span"));
        System.out.println(sourceList);
        System.out.println(sourceList.size());
        for(WebElement e:sourceList) {
            System.out.println(e.getText());
            if(e.getText().contains("Hyderabad")){
                e.click();
                break;
            }
        }
    }




}
