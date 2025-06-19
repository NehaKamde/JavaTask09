package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question02 {
	public static void main(String[] args) {

		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Navigate to the website
		driver.get("https://www.demoblaze.com/");

		// Get the title of the page
		String actualTitle = driver.getTitle();

		// Check if the title matches "STORE"
		if ("STORE".equals(actualTitle)) {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct website");
		}

		// Close the browser
		driver.quit();
	}
}
