package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Amazon34 {

	public static void main(String[] args) {

//		Step 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step 02

		WebElement searchAndclick = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchAndclick.sendKeys("iphone", Keys.ENTER);

//		Step 03

		String ExpValidated = "Results";
		WebElement Res = driver
				.findElement(By.xpath("//h2[@class='a-size-medium-plus a-spacing-none a-color-base a-text-bold']"));
		String actuRes = Res.getText().trim();
		Assert.assertEquals(ExpValidated, actuRes);

	}

}
