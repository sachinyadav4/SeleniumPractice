package org.seleniumautomation.com.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium15 {

    @Test
    public void testmethod01() throws Exception {

        // Open the https://katalon-demo-cura.herokuapp.com/
        // Verify the title and search a string in pageSource
        // Add assertion that the Cura heatlh care Service is visible in the page source.

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
       Assert.assertEquals(title, "CURA Healthcare Service");

       String pageSoruce = driver.getPageSource();
       Assert.assertTrue(pageSoruce.contains("CURA Healthcare Service"));

       //TestNG assertion
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");

       // AssertJ  assertion
        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isEqualTo("CURA Healthcare Service");

        if(driver.getPageSource().contains("CURA Healthcare Service")) {
            Assert.assertTrue(true);
        }
        else {
            throw new Exception("Heading not found");
        }


    }
}
