package org.seleniumautomation.com.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium18 {

    @Test
    public void testmethod01() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement freeTrialLink = driver.findElement(By.linkText("Start a free trial"));
        freeTrialLink.click();

           driver.quit();


    }
}
