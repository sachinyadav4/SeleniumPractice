package org.seleniumautomation.com.ex01_18122024;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Selenium_08 {

    @Test
    public void testmethod01(){
        FirefoxOptions options = new FirefoxOptions();

        options.addArguments("--window-size=720,720");
        options.addArguments("--incognito");
        options.addArguments("--headless");

        FirefoxDriver driver = new FirefoxDriver(options);
        driver.get("https://google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();



    }


}