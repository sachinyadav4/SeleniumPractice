package org.seleniumautomation.com.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium10 {

    @Test
    public void testMethod01(){

        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addExtensions(new File("src/test/java/org/seleniumautomation/com/ex02_20122024/AdBlock.crx"));

        EdgeDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://google.com");

    }
}
