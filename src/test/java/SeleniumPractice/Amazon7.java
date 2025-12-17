package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon7 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement seacrchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		seacrchbox.sendKeys("Iphone");
		WebElement searchbtnclick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtnclick.click();

//		Step 03

		String expectedRes = "Apple iPhone 15 (128 GB) - Black";
		List<WebElement> allItem = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement productName : allItem) {
			String actualRes = productName.getText().trim();

			if (actualRes.contains(expectedRes)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView()", productName);
				js.executeScript("arguments[0].click()", productName);
				break;

			}
		}

//		Step 04

		String ParentId = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();

		for (String s : allWindow) {
			if (!ParentId.equals(s)) {
				driver.switchTo().window(s);

				WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addtocart);
				js.executeScript("arguments[0].click()", addtocart);
				break;
			}
		}
	}

}
