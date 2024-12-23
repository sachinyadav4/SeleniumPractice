package org.seleniumautomation.com.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium12 {

    @Test
    public void testmethod01() throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");
         Thread.sleep(5000);
        //close vs quit
      //  driver.close();
        //close the current window and not the full browser
        // Closed the window, Session id != null, Error - Invalid session ID

        driver.quit();
        // Close all the /sessions/windows and stop the browser
        // Closed All the window and Session = null, Error - Session ID is null





    }


}
