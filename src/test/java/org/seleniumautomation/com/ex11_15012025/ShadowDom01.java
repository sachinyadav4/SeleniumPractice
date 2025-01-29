package org.seleniumautomation.com.ex11_15012025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShadowDom01 {

    @Test
    public void test_select_shadow_root_element_and_click(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");



        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://selectorshub.com/xpath-practice-page/");

        Actions actions = new Actions(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        String xpath = "//input[@id = 'myFile']";


        WebElement chooseFileElement = (WebElement) js.executeScript("return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;",xpath);
        // WebElement userName = (WebElement) js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#kils')");
        wait.until(ExpectedConditions.visibilityOf(chooseFileElement));

        js.executeScript("arguments[0].scrollIntoView(true);", chooseFileElement);

        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollToElement(chooseFileElement).build().perform();

        //String userJsPath = "return document.querySelector('#userName').shadowRoot.querySelector('#kils')";
        // WebElement userName = (WebElement) js.executeScript(userJsPath);
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", chooseFileElement);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement pizzaName = (WebElement) js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#app2').shadowRoot.querySelector('#pizza')");
        //wait.until(ExpectedConditions.elementToBeClickable(pizzaName));
        wait.until(ExpectedConditions.visibilityOf(pizzaName));
        pizzaName.sendKeys("Chicago Style");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
