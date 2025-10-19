package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon4 {

	public static void main(String[] args) {

//		Step : 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Iphone");

		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtn.click();

//		Step : 02

		String expectedRes = "Apple iPhone 15 (128 GB) - Black";
		List<WebElement> allProd = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement listProd : allProd) {

			String getItem = listProd.getText();
			if (getItem.equals(expectedRes)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", listProd);
				js.executeScript("arguments[0].click()", listProd);
				break;
			}

		}

	}

}
