package org.seleniumautomation.com.ex07_05012025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium24_JS_demo2 {

    @Test
    public void testmethod1() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        String url = "https://selectorshub.com/xpath-practice-page/";
        driver.get(url);
        driver.manage().window().maximize();

        JavascriptExecutor js;
        js = (JavascriptExecutor) driver;


        js.executeScript("window.scrollBy(0, 500);");

        String url2 = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url2);
        System.out.println(title);

    }
}
