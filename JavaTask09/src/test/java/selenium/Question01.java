package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question01 {

    public static void main(String[] args) throws InterruptedException {
       
        // Initialize FirefoxDriver
        WebDriver driver = new FirefoxDriver();

     
            // Maximize the browser window
            driver.manage().window().maximize();

            // Navigate to Google
            driver.get("http://google.com");

            // Print the current URL
            System.out.println("Current URL: " + driver.getCurrentUrl());

            // Refresh the page
            driver.navigate().refresh();

            // Optional: Wait for a few seconds to observe refresh
            Thread.sleep(2000);
        
            // Close the browser
            driver.quit();
        
    }
}

