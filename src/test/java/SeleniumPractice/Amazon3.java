package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon3 {

	public static void main(String[] args) {

//		Step : 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step : 02

		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys("Iphone");

		WebElement Searchclick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Searchclick.click();

//		Step : 03

		String expectedItem = "Apple iPhone 14 (256 GB) - Starlight";
		List<WebElement> allItem = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement ele : allItem) {

			String getItem = ele.getText().trim();

			if (getItem.equals(expectedItem)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", ele);
				js.executeAsyncScript("arguments[0].click()", ele);
				break;

			}

		}

	}

}
