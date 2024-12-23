package org.seleniumautomation.com.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium16 {

    @Test
    public void testmethod01() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        driver.findElement(By.id("login-username"))
                             .sendKeys("admin@admin.com");

        driver.findElement(By.id("login-password"))
                .sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();

        Thread.sleep(3000L);
       String msg = driver.findElement(By.id("js-notification-box-msg")).getText();

        Assert.assertEquals(msg, "Your email, password, IP address or location did not match");


         //assertj assertion
        assertThat(msg).isNotEmpty().isNotNull().isEqualTo("Your email, password, IP address or location did not match");



           driver.quit();


    }
}
