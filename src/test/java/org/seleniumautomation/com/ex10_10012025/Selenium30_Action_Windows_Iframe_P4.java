package org.seleniumautomation.com.ex10_10012025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Selenium30_Action_Windows_Iframe_P4 {

    EdgeDriver driver;

    @BeforeTest
    public void testmethod_action_tc1(){
        driver = new EdgeDriver();
    }



    @Test
    public void test_04() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Thread.sleep(2000);

        Set<String> windowHandles = driver.getWindowHandles();

        for(String handle:windowHandles) {
            System.out.println(handle);
            driver.switchTo().window(handle);
            Thread.sleep(2000);
        }

    }


}
