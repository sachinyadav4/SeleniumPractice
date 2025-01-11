package org.seleniumautomation.com.ex10_10012025;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class Selenium33_Relative_Locators_P8 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Description("Verify RL")
    @Test
    public void test_relative_locator() throws InterruptedException {

        // toRightOf
        //  LeftOf
        // AboveOf
        // below
        // near

        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();
        Thread.sleep(5000);
    }

}
