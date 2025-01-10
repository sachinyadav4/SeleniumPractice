package org.seleniumautomation.com.ex06_04012025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium24_JSAlerts {

    @Test
    public void testmethod1() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        jsAlert.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        jsConfirm.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        jsPrompt.click();
        Thread.sleep(2000);
        Alert alert =  driver.switchTo().alert();
        alert.sendKeys("test data");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

    }
}
