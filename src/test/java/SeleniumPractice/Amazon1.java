package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon1 {
	WebDriver driver;
	WebDriverWait wait;

	public static void main(String[] args) {
		Amazon1 AA = new Amazon1();
		AA.searchItem();
		AA.addToClick();
		AA.addToCartThrowWindowhandle();

	}

	public void searchItem() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Iphone 17");

		WebElement searchClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchClick.click();
	}

	public void addToClick() {

		String expectedResult = "Apple iPhone 11 (128GB) - Black";

		List<WebElement> getAllItem = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//h2"));

		for (WebElement product : getAllItem) {
			String actualResult = product.getText();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", product);

			if (actualResult.equals(expectedResult)) {
				js.executeScript("arguments[0].click()", product);
				break;
			}

		}
	}

	public void addToCartThrowWindowhandle() {

		String ParentId = driver.getWindowHandle();

		Set<String> aWindowhandle = driver.getWindowHandles();

		for (String s : aWindowhandle) {
			if (!ParentId.equals(s)) {
				driver.switchTo().window(s);

				WebElement ele = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", ele);
				js.executeScript("arguments[0].click()", ele);
				break;
			}
		}

	}

}
