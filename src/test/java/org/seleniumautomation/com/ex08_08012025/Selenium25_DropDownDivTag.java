package org.seleniumautomation.com.ex05_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CRMTask {


    @Test
    public void testmethod01(){
        EdgeDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demo.us.espocrm.com/?l=en_US#Account");

        WebElement btnLogin = driver.findElement(By.cssSelector("button[id='btn-login']"));
        btnLogin.click();

        WebElement linkContacts = driver.findElement(By.cssSelector("span[title='Contacts']"));
        linkContacts.click();

        WebElement createContact = driver.findElement(By.cssSelector("a[data-name='create']"));
        createContact.click();


        WebElement btnSave = driver.findElement(By.cssSelector("button[data-action='save']"));
        btnSave.click();

        WebElement message  = driver.findElement(By.cssSelector("div[class='message']"));
        System.out.println("Error Message: " + message.getText());
        Assert.assertEquals(message.getText(), "Not valid");

        driver.quit();
    }
}
