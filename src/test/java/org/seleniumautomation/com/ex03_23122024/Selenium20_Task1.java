package org.seleniumautomation.com.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium20_Task1 {

    @Test
    public void testmethod01() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.findElement(By.id(""));

        //find and click appointment button
        WebElement btn_appointment = driver.findElement(By.id("btn-make-appointment"));
        btn_appointment.click();

        //enter user name
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("John Doe");

        //enter password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ThisIsNotAPassword");

        //click on login button
        WebElement btn_login = driver.findElement(By.id("btn-login"));
        btn_login.click();

          //verify current url
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        //assertj
        assertThat(driver.getCurrentUrl()).isNotNull().isNotEmpty().isEqualTo("https://katalon-demo-cura.herokuapp.com/#appointment");

           driver.quit();


    }
}
