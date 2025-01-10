package org.seleniumautomation.com.ex06_04012025;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Selenium23_FluentWait {

    @Test
    public void testmethod1(){

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[@href='/dynamic_loading']")).click();

        driver.findElement(By.xpath("//a[@href='/dynamic_loading/1']")).click();
        
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        //div[@id='loading']

        Wait<EdgeDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

     WebElement textHelloWorld =  wait.until(new Function<WebDriver, WebElement>(){

            @Override
            public WebElement apply(WebDriver webDriver) {
                WebElement element = driver.findElement(By.xpath("//div[@id='finish']"));
                if(element.isDisplayed()){
                    return element;
                }
                else {
                    return null;
                }
            }


    });
    }
}
