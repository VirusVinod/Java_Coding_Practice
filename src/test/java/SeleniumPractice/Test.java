package SeleniumPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("vinos");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("vinos");

		WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
		log.click();

//
//		String acctualvalue = "aaaa";
//		String expectedValue = "aaaa";
//		Assert.assertEquals(expectedValue, acctualvalue);

	}
}
