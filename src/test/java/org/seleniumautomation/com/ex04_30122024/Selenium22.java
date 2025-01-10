package org.seleniumautomation.com.ex04_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium22 {

    @Test
    public void testmethod01() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

      //  Thread.sleep(3000L);

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchInput.sendKeys("macmini");

       WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
       searchBtn.click();

       List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-item__title']"));

       List<WebElement> searchTitlesPrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

       int size = Math.min(searchTitles.size(), searchTitlesPrices.size());

       for(int i=0; i<size; i++){

           System.out.println("Title: " + searchTitles.get(i).getText() + " || " + " Price: " +
                   searchTitlesPrices.get(i).getText());


       }

        //Assert.assertEquals(error_msg.getText(), "The email address you entered is incorrect.");

        //assertj
       // assertThat(driver.findElement(By.id("upgrade")).getText()).isNotNull().isNotEmpty().contains("Your free trial has expired");

         //  driver.quit();


    }
}
