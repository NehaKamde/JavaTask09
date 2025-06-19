package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Question03 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Open Wikipedia homepage
		driver.get("https://www.wikipedia.org");

		// Wait setup
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate search input, enter "Artificial Intelligence", and submit
		WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));
		searchInput.sendKeys("Artificial Intelligence");
		searchInput.submit();

		// Wait for the article page to load and "History" section link to appear
		WebElement historyLink = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='#History']")));
		historyLink.click();

		// Wait for the History section heading to be visible
		WebElement historyHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("History")));

		// Print the title of the "History" section
		System.out.println("Section title: " + historyHeading.getText());

		// Close the browser
		driver.quit();
	}
}
