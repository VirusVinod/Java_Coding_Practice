package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon5 {

	public static void main(String[] args) {

//		Step : 01
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		Step : 02
		WebElement secarchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		secarchbox.sendKeys("Iphone");

		WebElement clcikbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clcikbtn.click();

//		Step : 03

		String expectedRes = "Apple iPhone 15 (128 GB) - Green";
		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));

		for (WebElement ele : allProducts) {

			String getallProductName = ele.getText().trim();

			if (getallProductName.contains(expectedRes)) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", ele);
				wait.until(ExpectedConditions.visibilityOf(ele));
				js.executeScript("arguments[0].click()", ele);
				break;

			}

		}
//		Step : 04

		String parentId = driver.getWindowHandle();

		Set<String> allWindow = driver.getWindowHandles();
		for (String s : allWindow) {
			if (!parentId.equals(s)) {
				driver.switchTo().window(s);

				WebElement addtoCrt = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", addtoCrt);
				js.executeScript("arguments[0].click()", addtoCrt);
				break;
			}
		}

	}

}
