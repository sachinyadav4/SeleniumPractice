package org.seleniumautomation.com.ex07_05012025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium24_WebTable_Static {

    @Test
    public void testmethod1() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        String url = "https://awesomeqa.com/webtable.html";
        driver.get(url);
        driver.manage().window().maximize();

        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();


        String tableCell_Start = "//table[@id='customers']/tbody/tr[";
        String tableCell_Mid = "]/td[";
        String tableCell_End = "]";

        // i = row count
        // j = column count

        for(int i=2; i<= rows; i++) {
            for(int j=1; j<=columns; j++){
                String dynamic_xpath = tableCell_Start + i + tableCell_Mid + j + tableCell_End;
                String cellValue = driver.findElement(By.xpath(dynamic_xpath)).getText();

                if(cellValue.contains("Helen Bennett")) {
                    System.out.println("Finding Country: ");
                    System.out.println(driver.findElement(By.xpath(dynamic_xpath + "/following-sibling::td")).getText());
                }
            }
            System.out.println();
        }

    }
}
