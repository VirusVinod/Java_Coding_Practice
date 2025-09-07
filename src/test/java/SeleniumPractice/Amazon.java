package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
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

	}

}
