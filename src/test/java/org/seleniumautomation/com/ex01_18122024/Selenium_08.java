package org.seleniumautomation.com.ex01_18122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Selenium_08 {

    @Test
    public void testmethod01(){
        EdgeOptions options = new EdgeOptions();

        options.addArguments("--window-size=720,720");
        options.addArguments("--incognito");
      //  options.addArguments("--headless");

        EdgeDriver driver = new EdgeDriver(options);
        driver.get("https://www.amazon.com");
        System.out.println("Title: " + driver.getTitle());
      // driver.quit();



    }


}