package org.seleniumautomation.com.ex08_08012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium26_OrangeHrCountTerminate {


    @Test
    public void testmethod01(){
        EdgeDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://awesomeqa.com/hr/web/index.php/auth/login");

        WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("Hacker@4321");

        WebElement btnLogin = driver.findElement(By.cssSelector("button[type='submit']"));
        btnLogin.click();

        List<WebElement> terminateText = driver.findElements(By.xpath("//div[contains(text(), 'Terminated')]"));
        System.out.println(terminateText.size());
     /*
       boolean flag = false;

        ////div[@class='oxd-table-card'][1]//div[@class='oxd-table-cell oxd-padding-cell']/child::div/button/i[contains(@class, 'trash')]

        int rows = driver.findElements(By.xpath("//div[@class='oxd-table-card']")).size();

        String col_cell_start = "//div[@class='oxd-table-card'][";
        String col_cell_end = "]//div[@class='oxd-table-cell oxd-padding-cell']";
        String col_cell_delete_icon = "/child::div/button/i[contains(@class, 'trash')]";

        for(int i=1; i<=rows; i++) {

            List<WebElement> cols = driver.findElements(By.xpath(col_cell_start+i+col_cell_end));
           // System.out.println("Row: "+i + " col count " + cols.size());

            for(WebElement w:cols){
                String cell_value = w.getText();
                if(cell_value.contains("Terminated")){
                    System.out.println("Found first terminated employee record where Row no. : " + i);
                    System.out.println("Xpath of Delete button: " + col_cell_start+i+col_cell_end+col_cell_delete_icon);
                    flag = true;
                    break;
                }
            }

            if(flag) {
                break;
            }



        }

      */

        //driver.quit();
    }
}
