package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage5 {
	public static void main(String[] args) {
//		Step : 01

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		Step : 02

		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement btnClick = driver.findElement(By.id("login-button"));
		btnClick.click();

		


	}

}
