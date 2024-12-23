package org.seleniumautomation.com.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium21_Task2 {

    @Test
    public void testmethod01() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        //Enter first name
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Sachin");

        //Enter last name
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Yadav");

        //Select Gender
        WebElement gender = driver.findElement(By.id("sex-0"));
        gender.click();

        //Select years of experience
        WebElement experience = driver.findElement(By.id("exp-6"));
        experience.click();

        //Enter date
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("23122024");

        //Select profession
        WebElement profession = driver.findElement(By.id("profession-1"));
        profession.click();

        //Select automation tools
        WebElement tools = driver.findElement(By.id("tool-2"));
        tools.click();

           //Not adding any assertion as taks was to enter values and select radio button and checkbox
           Thread.sleep(3000L); //just added to set a pause to see all values

           driver.quit();


    }
}
