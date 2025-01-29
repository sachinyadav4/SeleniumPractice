package org.seleniumautomation.com.ex10_10012025;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class ClickSVG {

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
    public void test_svgClick() throws InterruptedException {


        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(15000);

        driver.findElement(By.name("q")).sendKeys("macmini");

      //  WebElement svgElement = driver.findElement(By.xpath("//button[@type='submit']//*[local-name()='svg']"));


       /* List<WebElement> svgElement = driver.findElements(By.xpath("//*[local-name()='svg']"));

        svgElement.get(0).click(); */

        WebElement svgElement = driver.findElement(By.xpath("//button[@type='submit']//*[local-name()='svg']"));

        svgElement.click();


        Thread.sleep(3000);


    }
    }
