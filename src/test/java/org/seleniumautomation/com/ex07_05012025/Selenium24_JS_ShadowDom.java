package org.seleniumautomation.com.ex07_05012025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium24_JS_ShadowDom {

    @Test
    public void testmethod1() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        String url = "https://selectorshub.com/xpath-practice-page/";
        driver.get(url);
        driver.manage().window().maximize();

        JavascriptExecutor js;
        js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("arguments[0].scrollIntoView(true);", div_to_scroll);


        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\");");
        inputboxPizza.sendKeys("farmhouse");

    }
}
