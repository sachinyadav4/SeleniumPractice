package org.seleniumautomation.com.ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium22 {

    @Test
    public void testmethod01() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(3000L);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("augtest_040823@idrive.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");


        WebElement signinBtn =  driver.findElement(By.id("frm-btn"));
        signinBtn.click();

        Thread.sleep(16000L);

        System.out.println(driver.findElement(By.id("upgrade")).getText());

        /*WebElement error_msg = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(error_msg.getText(), "The email address you entered is incorrect.");
*/
        //assertj
        assertThat(driver.findElement(By.id("upgrade")).getText()).isNotNull().isNotEmpty().contains("Your free trial has expired");

           driver.quit();


    }
}
