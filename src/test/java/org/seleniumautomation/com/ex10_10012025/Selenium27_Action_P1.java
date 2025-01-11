package org.seleniumautomation.com.ex10_10012025;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Selenium27_Action_Windows_Iframe_P1 {

    EdgeDriver driver;

    @BeforeTest
    public void testmethod_action_tc1(){
        driver = new EdgeDriver();
    }

    @Test
    public void testmethod01() {


        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://awesomeqa.com/practice.html");

        WebElement firstname = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys(firstname, "the test case")
                .keyUp(Keys.SHIFT).build().perform();

    }

    @Test
    public void testmethod_action_tc2(){
        driver.manage().window().maximize();

        driver.navigate().to("https://www.spicejet.com/");

        WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));

        Actions actions = new Actions(driver);
        actions.moveToElement(source).click().build().perform();
        actions.moveToElement(source).click().sendKeys("HYD").build().perform();
    }


    @Test
    public void testmethod_action_tc3() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

         WebElement fromCity = driver.findElement(By.id("fromCity"));

         Actions actions = new Actions(driver);

         actions.moveToElement(fromCity).click().build().perform();
        actions.moveToElement(fromCity).click().sendKeys("HYD").build().perform();

        List<WebElement> sourceList = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li/div/div/p/span/span"));
        System.out.println(sourceList);
        System.out.println(sourceList.size());
        for(WebElement e:sourceList) {
            System.out.println(e.getText());
            if(e.getText().contains("Hyderabad")){
                e.click();
                break;
            }
        }
    }


    @Test
    public void test_04() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Thread.sleep(2000);

        Set<String> windowHandles = driver.getWindowHandles();

        for(String handle:windowHandles) {
            System.out.println(handle);
            driver.switchTo().window(handle);
            Thread.sleep(2000);
        }

    }


}
