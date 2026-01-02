package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon17 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");

		WebElement clickbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clickbtn.click();

//		Step 03

		String expectedRes = "iPhone 15 (128 GB) - Black";
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement name : list) {
			String productName = name.getText().trim();

			if (productName.equals(expectedRes)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", name);
				js.executeScript("arguments[0].click()", name);
				break;
			}

		}

//		Step 04

		String parentId = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();

		for (String w : allWin) {
			if (!parentId.equals(w)) {
				driver.switchTo().window(w);

				WebElement addtoCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addtoCart);
				js.executeScript("arguments[0].click()", addtoCart);
				break;
			}
		}

	}

}
