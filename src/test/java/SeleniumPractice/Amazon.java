package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement searchProduct = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchProduct.sendKeys("Iphone");

		WebElement afterSearchClickBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		afterSearchClickBtn.click();

		String tragetProductName = "Apple iPhone 15 (128 GB) - Black";
		List<WebElement> getAllProductList = driver
				.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2"));
		
		for (WebElement product : getAllProductList) {
			String getProductName = product.getText();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", product);
			if (getProductName.equalsIgnoreCase(tragetProductName)) {
			
				js.executeScript("arguments[0].click()", product);
				break;

			}
		}
		
		String pranetId = driver.getWindowHandle();
		System.out.println(pranetId);
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String s : allWindows) {
			if(!pranetId.equals(s)) {
				driver.switchTo().window(s);
                WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true)", addToCart);
                js.executeScript("arguments[0].click()", addToCart);
                System.out.println("Clicked Add to Cart button successfully!");
				break;

			}
		}
		
//		driver.quit();

	}

}
