package org.seleniumautomation.com.ex08_08012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium26_OrangeHrDelete {


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


        WebElement mobileDropDown = driver.findElement(By.xpath("//div[@data-value='Mobile']/ancestor::div[contains(@class, 'selectize-input')]"));
        mobileDropDown.click();

        WebElement mobileDropDownOffice = driver.findElement(By.xpath("//div[@data-value='Office']"));
        mobileDropDownOffice.click();


        //driver.quit();
    }
}
