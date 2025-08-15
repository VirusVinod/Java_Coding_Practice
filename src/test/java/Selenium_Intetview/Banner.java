package Selenium_Intetview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Banner {

	public static void main(String[] args) {
		  // Set Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        // Launch browser
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.askzenixtechnologies.com/");

        // Set waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Wait for any <h2> on the page to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2")));

        // Get all h2 elements (you can refine this later)
        List<WebElement> slides = driver.findElements(By.xpath("//h2"));

        // Loop through all h2s
        for (WebElement we : slides) {
            String bannerText = we.getText().trim();
            System.out.println("Banner Text: " + bannerText);

            // Optional: get class attribute
            String classAttr = we.getAttribute("class");
            if (classAttr != null && classAttr.contains("owl-item active")) {
                System.out.println("This slide is active.");
            }
        }

//        Thread.sleep(2000);  // Only for demo purposes
//        driver.quit();
	}



}
