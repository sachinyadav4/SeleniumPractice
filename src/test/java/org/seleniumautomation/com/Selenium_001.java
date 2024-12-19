package org.seleniumautomation.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium_001 {

    @Test
    public void test_selenium(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
