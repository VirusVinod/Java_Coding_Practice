package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class VerifiesThePageTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		String expectedResule = "Google";
		String actualRes = driver.getTitle();
		Assert.assertEquals(expectedResule, actualRes);

		System.out.println("Expected Result : " + expectedResule);
		System.out.println("Actual Result : " + actualRes);

		driver.quit(); 

	}

}
