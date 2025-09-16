package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage3 {

	public static void main(String[] args) {
		LoginPage3 ll = new LoginPage3();
		ll.setup();
		ll.login();
	}

// Step 0: Declare driver at class level
	WebDriver driver;

//	Step : 1

	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

//	Step : 2

	public void login() {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();

	}

}
