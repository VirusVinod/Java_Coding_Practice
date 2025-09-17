package automationClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdowns {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement selectValue = driver.findElement(By.xpath("//select[@id='course']"));

		Select s = new Select(selectValue);
		s.selectByVisibleText("Python");

//		s.selectByValue("net");
//		s.selectByIndex(2);


		driver.quit();

	}

}
