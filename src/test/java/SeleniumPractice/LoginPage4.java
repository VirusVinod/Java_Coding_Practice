package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage4 {
	WebDriver driver;

	public static void main(String[] args) {
		LoginPage4 ll = new LoginPage4();
		ll.setup();

	}

	// Setup: 1
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
