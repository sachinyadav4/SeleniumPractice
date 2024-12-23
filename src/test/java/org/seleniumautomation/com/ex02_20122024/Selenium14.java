package org.seleniumautomation.com.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium14 {

    @Test
    public void testmethod01(){
        EdgeDriver driver = new EdgeDriver();
        //driver.get("google.com"); will not work malformed URL
        //driver.get("https://google.com"); will work
        //driver.get("http://sdet.live");
//        driver.get("www.google.com"); // will not work malformed URL

    }

}
