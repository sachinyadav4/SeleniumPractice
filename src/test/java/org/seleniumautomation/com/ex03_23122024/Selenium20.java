package org.seleniumautomation.com.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium20 {

    @Test
    public void testmethod01() {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");

        //Thread.sleep(3000L);
        By locatorUsername = By.id("username");

        WebElement username = waitForElementVisibility(driver, locatorUsername, 3);

        username.sendKeys("augtest_040823@idrive.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");


        WebElement signinBtn =  driver.findElement(By.id("frm-btn"));
        signinBtn.click();

        By locatorUpgradeMsg = By.id("upgrade");

        waitForElementVisibility(driver, locatorUpgradeMsg, 15);

        System.out.println(driver.findElement(By.id("upgrade")).getText());

        /*WebElement error_msg = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(error_msg.getText(), "The email address you entered is incorrect.");
*/
        //assertj
        assertThat(driver.findElement(By.id("upgrade")).getText()).isNotNull().isNotEmpty().contains("Your free trial has expired");

           driver.quit();


    }

    public static WebElement waitForElementVisibility(WebDriver driver, By locator, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        wait.pollingEvery(Duration.ofSeconds(1));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
