package org.seleniumautomation.com.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class Selenium19 {

    @Test
    public void testmethod01() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement freeTrialLink = driver.findElement(By.linkText("Start a free trial"));
        freeTrialLink.click();

        WebElement emailBox = driver.findElement(By.id("page-v1-step1-email"));

        emailBox.sendKeys("1111111111111111");

        WebElement consentChkbox =  driver.findElement(By.name("gdpr_consent_checkbox"));
        consentChkbox.click();

        List<WebElement> list_button = driver.findElements(By.tagName("button"));
        list_button.get(0).click();

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(error_msg.getText(), "The email address you entered is incorrect.");

        //assertj
        assertThat(error_msg.getText()).isNotNull().isNotEmpty().isEqualTo("The email address you entered is incorrect.");

           driver.quit();


    }
}
