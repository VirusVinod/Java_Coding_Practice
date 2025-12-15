package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	WebDriver driver;
	WebDriverWait wait;
	static long timeout = 15;

	public static void main(String[] args) {

		Test1 tt = new Test1();
		tt.searchItem();
	}

	public void clickOnElement(WebElement ele) {
		try {
			waitForElement(ele, 15).click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
			js.executeScript("arguments[0].click()", ele);
		}
	}

	public WebElement waitForElement(WebElement ele, long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public void listOfElementsClickByText(List<WebElement> ele, String expectedText) {
		for (WebElement element : ele) {
			String actualText = element.getText().trim();

			if (actualText.contains(expectedText)) {
				clickOnElement(element);
				return;
			}
		}

		throw new NoSuchElementException(
				"Element containing text '" + expectedText + "' not found in given WebElement list");
	}

	public void searchItem() {
//		Step :01

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Iphone");

		WebElement searchClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchClick.click();

//		Step :02	
		String expectedResult = "Apple iPhone 14 (256 GB) - Starlight";
		List<WebElement> getAllItem = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//h2"));
		listOfElementsClickByText(getAllItem, expectedResult);
	}

}
