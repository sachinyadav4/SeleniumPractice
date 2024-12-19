package org.seleniumautomation.com;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_002 {

    @Test
    public void test_selenium(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.quit();
    }
}
