package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon21 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchItem = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchItem.sendKeys("iphone");

		WebElement clicksearchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clicksearchbtn.click();

//		Step 03

		String nextPaegeValidated = "Results";
		WebElement res = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String getVal = res.getText().trim();
		Assert.assertEquals(nextPaegeValidated, getVal);
		System.out.println("Expected res : " + nextPaegeValidated);
		System.out.println("Actual Res : " + getVal);

	}

}
