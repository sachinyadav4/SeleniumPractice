package org.seleniumautomation.com.ex12_DataDrivenTesting.realtimescenario;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class DDTRealtime01 {

    WebDriver driver = new EdgeDriver();

    @BeforeClass
    public void setUp(){

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Test(dataProvider = "loginData")
    public void testDataDriven(String email, String password, String expectedResult) {

        driver.get("https://app.vwo.com");
        WebElement emailElement = driver.findElement(By.id("login-username"));
        emailElement.clear();
        emailElement.sendKeys(email);

        WebElement passwordElement = driver.findElement(By.id("login-password"));
        passwordElement.clear();
        passwordElement.sendKeys(email);

        driver.findElement(By.id("js-login-btn")).click();

        if(expectedResult.equalsIgnoreCase("Valid")){
            String text = driver.findElement(By.cssSelector("[data-qa=\"lufexuloga\"]")).getText();
            System.out.println(text);
            Assert.assertEquals(text, "Wingify");

        }

        if(expectedResult.equalsIgnoreCase("InValid")){

            WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

            wait.until(ExpectedConditions.visibilityOf(error_message));

            Assert.assertTrue(error_message.isDisplayed());
            Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");
        }

    }

 /*   @DataProvider(name = "loginData")
    public Object[][] testData(){

        return new Object[][] {
                {"TD1", "93npu2yyb0@esiix.com", "Wingify@1234", "Invalid"},
                {"TD2", "93npu2yyb0@esiixi.com", "Wingify@1234", "Valid"}

        };

    } */

    @DataProvider(name = "loginData")
    public String[][] testDataExcel() throws IOException {

        String testDataFile ="src/test/resources/TData.xlsx";
        ExcelReader excelReader = new ExcelReader(testDataFile);

        String[][] data = excelReader.getDataFromSheet(testDataFile, "LoginData");

        return data;
    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
