package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon18 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");

		WebElement searchbtnClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtnClick.click();

//		Step 03

		String expectedRes = "iPhone 16e 128 GB: Built for Apple Intelligence, A18 Chip, Supersized Battery Life, 48MP Fusion. Camera, 15.40 cm (6.1″) Super Retina XDR Display; Black";
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
		Set<String> alwin = driver.getWindowHandles();

		for (String w : alwin) {
			if (!parentId.equals(w)) {
				driver.switchTo().window(w);

				WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addtocart);
				js.executeScript("arguments[0].click()", addtocart);
				break;

			}
		}

	}

}
