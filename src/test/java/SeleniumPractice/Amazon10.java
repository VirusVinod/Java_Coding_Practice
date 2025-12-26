package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon10 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

//		Step 02

		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("iphone");

		WebElement clicksearchboxbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clicksearchboxbtn.click();

//		Step 03

		String expectedRes = "iPhone 14 (256 GB) - Starlight";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));
		for (WebElement product : list) {
			String ProductName = product.getText().trim();

			if (ProductName.equals(expectedRes)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView()", product);
				wait.until(ExpectedConditions.visibilityOf(product));
				js.executeScript("arguments[0].click()", product);
				break;
			}
		}

	}

}
