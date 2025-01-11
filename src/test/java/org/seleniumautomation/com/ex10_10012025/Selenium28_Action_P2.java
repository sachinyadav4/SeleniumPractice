package org.seleniumautomation.com.ex10_10012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium28_Action_Windows_Iframe_P2 {

    EdgeDriver driver;

    @BeforeTest
    public void testmethod_action_tc1(){
        driver = new EdgeDriver();
    }


    @Test
    public void testmethod_action_tc2(){
        driver.manage().window().maximize();

        driver.navigate().to("https://www.spicejet.com/");

        WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().build().perform();
        actions.moveToElement(source).click().sendKeys("HYD").build().perform();
    }






}
