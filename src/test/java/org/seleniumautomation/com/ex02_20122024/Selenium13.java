package org.seleniumautomation.com.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium13 {

    @Test
    public void testmethod01(){

        EdgeDriver driver = new EdgeDriver();

      //  driver.get("https://google.com");
      //  driver.get("https://bing.com");

        // No back, forward allowed in case of get()

        driver.navigate().to("https://google.com");

        driver.navigate().to("https://bing.com");

        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getTitle());
    }
}
