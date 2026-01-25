package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon39 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searcItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searcItem.sendKeys("iphone");

		WebElement BtnsearcItemClick = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		BtnsearcItemClick.click();

//		Step 03

		String expectedResult = "Results";
		WebElement result = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actualResult = result.getText().trim();
		Assert.assertEquals(expectedResult, actualResult);
	}

}
