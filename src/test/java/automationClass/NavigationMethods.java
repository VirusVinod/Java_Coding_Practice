package automationClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().refresh();
		
		driver.navigate().to("https://www.saucedemo.com/v1/");

	}

}
