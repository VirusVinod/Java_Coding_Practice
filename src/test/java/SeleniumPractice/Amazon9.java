package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon9 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Step 02

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");

		WebElement btnsearchclick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnsearchclick.click();

//		Step 03

		String expectedRes = "iPhone 15 (128 GB) - Black";

		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement allList : list) {
			String productName = allList.getText().trim();

			if (productName.equals(expectedRes)) {

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", allList);
				js.executeScript("arguments[0].click()", allList);
				break;
			}
		}

//		Step 04

		String parentId = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		for (String s : allwin) {
			if (!parentId.equals(s)) {
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
